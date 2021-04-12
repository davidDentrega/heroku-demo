package org.brenda.delarosa.controller;

import java.util.List;

import org.brenda.delarosa.model.Categoria;
import org.brenda.delarosa.service.IntCategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
//ANOTACION @RequestMapping A NIVEL DE LA CLASE
@RequestMapping(value="/categorias")

public class CategoriasController {
	
	@Autowired
	private IntCategoriasService categoriasService;
	
	
	@RequestMapping(value="/editar",method=RequestMethod.GET)
	public String editar(@RequestParam("id") int idCategoria, Model model)
	{ Categoria categoria = categoriasService.buscarPorId(idCategoria);
	model.addAttribute ("categoria",categoria);
	return "categorias/formCategoria";
	}
	
	//ANOTACION ANTERIOR PARA SOLICITAR PETICIONES
	//@GetMapping("/index")
	//Request A NIVEL DEL METODO
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String mostrarIndex(Model model) {
		List<Categoria> lista = categoriasService.obtenerTodas();
		for(Categoria c : lista) {
			System.out.println(c);
		}
		model.addAttribute("categorias", lista);
		return "categorias/listaCategorias";
	}
	//@GetMapping("/crear")
	@RequestMapping(value="/crear",method=RequestMethod.GET)
	public String crear() {
		return "categorias/formCategorias";
		
	}
	@RequestMapping(value="/guardar",method=RequestMethod.POST)
	public String guardar(Categoria categoria, RedirectAttributes attributes) {
		//categoria.setId(categoriasService.obtenerTodas().size()+1);
		categoriasService.guardar(categoria);
		attributes.addFlashAttribute("msg","¡La categria se guardo!");
		return "redirect:/categorias/index";
	}
	//@GetMapping("/guardar")
	/*@RequestMapping(value="/guardar",method=RequestMethod.POST)
	//HACER LA VINCULACION DE LOS ELEMENTOS DE FORMULARIO CON LAS VARIABLES
	//QUE RECIBEN LOS PARAMENTROS (DATA BINDING)
	public String guardar(@RequestParam("nombre")String nombre,
			@RequestParam("descripcion")String descripcion) {
		System.out.println("Nombre : " + nombre);
		System.out.println("Descripción : " + descripcion);
		return "categorias/listaCategorias";
	}*/

}
