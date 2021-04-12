package org.brenda.delarosa.service;

import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.List;

import org.brenda.delarosa.model.Categoria;
import org.springframework.stereotype.Service;

@Service
public class CategoriasServiceImp implements IntCategoriasService {
	//VARIABLE DE CLASE
        List<Categoria> lista = null;
	
	public CategoriasServiceImp() {
		lista = new LinkedList<Categoria>();
		try {
			Categoria c1 = new Categoria();
			c1.setId(1);
			c1.setNombre("Ventas");
			c1.setDescripcion("Relacionado con la administración de ventas");
			lista.add(c1);
			//*******************************************
			Categoria c2 = new Categoria();
			c2.setId(2);
			c2.setNombre("Informática");
			c2.setDescripcion("Relacionado con el manejo de computación e desarrollo de software");
			lista.add(c2);
			//******************************************
			Categoria c3 = new Categoria();
			c3.setId(3);
			c3.setNombre("Contabilidad");
			c3.setDescripcion("Relacionado con el manejo de finanzas");
			lista.add(c3);
			//******************************************
			Categoria c4 = new Categoria();
			c4.setId(4);
			c4.setNombre("Construcción");
			c4.setDescripcion("Relacionado con administración de fabricar edificios e infraestructuras");
			lista.add(c4);
			//********************************************
			Categoria c5 = new Categoria();
			c5.setId(5);
			c5.setNombre("Transporte");
			c5.setDescripcion("Relacionado para trasladar personas o cosas de un lugar a otro");
			lista.add(c5);
			
			}catch(DateTimeParseException ex) {
			System.out.println("Error : "+ ex.getMessage());
		}
		
}
	@Override
	public List<Categoria> obtenerTodas(){
		// TODO Auto-generated method stub
				return lista;
	}
	@Override
	public Categoria buscarPorId(Integer idCategoria) {
		// TODO Auto-generated method stub
				for(Categoria categoria : obtenerTodas()) {
					if(categoria.getId() == idCategoria) {
						return categoria;
					}
				}
				return null;	
	}
	@Override
	public void guardar(Categoria categoria) {
		// TODO Auto-generated method stub
		lista.add(categoria);
		
	}
}
