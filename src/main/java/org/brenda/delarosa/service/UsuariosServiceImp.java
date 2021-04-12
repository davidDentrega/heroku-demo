package org.brenda.delarosa.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.List;

import org.brenda.delarosa.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServiceImp implements IntUsuariosService {

	private List<Usuario> lista = null;
	
	public UsuariosServiceImp() {
		
		lista = new LinkedList<Usuario>();
		
		try {
			Usuario u1 = new Usuario();
			u1.setId(1);
			u1.setNombre("Brenda");
			u1.setUsername("Brens");
			u1.setPassword("123456");
			u1.setEmail("brens_arguello22@outlook.es");
			u1.setFechaRegistro(LocalDate.parse("18-02-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")));
			u1.setEstatus(1);
			lista.add(u1);
			//******************************************************
			Usuario u2 = new Usuario();
			u2.setId(2);
			u2.setNombre("Daniel");
			u2.setUsername("Dann");
			u2.setPassword("654321");
			u2.setEmail("daniel_Luna21@outlook.es");
			u2.setFechaRegistro(LocalDate.parse("18-02-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")));
			u2.setEstatus(0);
			lista.add(u2);
			//******************************************************
			Usuario u3 = new Usuario();
			u3.setId(3);
			u3.setNombre("Juan");
			u3.setUsername("Manuel");
			u3.setPassword("123456");
			u3.setEmail("juan.manuel22@outlook.es");
			u3.setFechaRegistro(LocalDate.parse("18-02-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")));
			u3.setEstatus(1);
			lista.add(u3);
			
		}catch(DateTimeParseException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
	
	@Override
	public List<Usuario> obtenerTodas() {
		// TODO Auto-generated method stub
		
		return lista;
	}

	@Override
	public Usuario buscarPoId(Integer idUsuario) {
		// TODO Auto-generated method stub
		for(Usuario usuario : lista) {
			if(usuario.getId() == idUsuario) {
				return usuario;
			}
		}
		return null;
	}

	@Override
	public void guardar(Usuario usuario) {
		// TODO Auto-generated method stub
		lista.add(usuario);

	}

	@Override
	public void eliminar(Integer idUsuario) {
		// TODO Auto-generated method stub
		lista.remove(idUsuario);

	}

}
