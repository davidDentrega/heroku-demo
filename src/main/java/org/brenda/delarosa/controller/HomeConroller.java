package org.brenda.delarosa.controller;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.List;

import org.brenda.delarosa.model.Vacante;
import org.brenda.delarosa.service.IntVacantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeConroller {
	
	@Autowired
	private IntVacantesService serviceVacantes;
	
	@GetMapping("/")
	public String mostrarHome(Model model) {
		//DEVUELVE UNA VISTA(UN ARCHIVO HTML)
		List<Vacante> vacantes = serviceVacantes.obtenerTodas();
		model.addAttribute("vacantes", vacantes);
		return "home";
	}
	@GetMapping("/mensaje")
	public String mensaje(Model model) {
		//FORMATEAR UNA FECHA
		//LocalDate fecha = LocalDate.now();
		//PERZONALIZAR LA FECHA
		LocalDate fecha = null;
		try {
			fecha = LocalDate.parse("23-04-2020", DateTimeFormatter.ofPattern("dd-MM-yy"));
			System.out.println("Fecha: " + fecha);
		}catch(DateTimeException ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		model.addAttribute("msg", "Bienvenidos a mi aplicación: Empleos App");
		model.addAttribute("fecha", java.sql.Date.valueOf(fecha));
		return "mensaje";
	}
	
	//**********************************************************************
	//METODO PARA MANIPULAR DIVERSOS TIPOS DE DATOS
	@GetMapping("/vacante")
	public String vacante(Model model) {
		Integer id = 1000;
		String nombre = "Programador de Aplicaciones Web";
		LocalDate fecha = LocalDate.now();
		Double salario = 12500.00;
		Boolean vigente = true;
		model.addAttribute("id", id);
		model.addAttribute("nombre", nombre);
		model.addAttribute("fecha", fecha);
		model.addAttribute("salario", salario);
		model.addAttribute("vigente", vigente);
		return "vacante";
	}
	//UNA CONEXION DE DATOS
	@GetMapping("/lista")
	public String lista(Model model) {
		List<String> vacantes = new LinkedList<String>();
		vacantes.add("Contador Público");
		vacantes.add("Programador de Aplicaciones");
		vacantes.add("Tecnico de Mantenimiento de Computadoras");
		vacantes.add("Arquitecto");
		vacantes.add("Ingenieron en Electronica");
		//IMPRIMIR EL ARREGLO
		for(String elemento : vacantes) {
			System.out.println(elemento);
		}
		model.addAttribute("Vacantes", vacantes);
		return "vacante";
	}
	//UN METODO QUE DEVUELVA UN OBJETO DE TIPO VACANTE
	@GetMapping("/detalles")
	public String detalles(Model model) {
		Vacante v = new Vacante();
		System.out.println(v);
		v.setId(100);
		v.setNombre("Ingeniero Electronico");
		v.setDescripcion("Relaciona con aplicaciones para IOT");
		v.setFecha(LocalDate.now());
		v.setSalario(12800.0);
		System.out.println(v);
		model.addAttribute("vacante", v);
		return "detalles";
	}
	//***********************************
	@GetMapping("/tabla")
	public String mostrarVacante(Model model) {
		List<Vacante> vacantes = serviceVacantes.obtenerTodas();
		for(Vacante elemento : vacantes) {
			System.out.println(elemento.getId());
			System.out.println(elemento.getNombre());
			System.out.println(elemento.getDescripcion());
			System.out.println(elemento.getFecha());
			System.out.println(elemento.getSalario());
			System.out.println(elemento.getDestacado());
		}
		model.addAttribute("vacantes", vacantes);
		return "tabla";
	}
	
	
	}




































