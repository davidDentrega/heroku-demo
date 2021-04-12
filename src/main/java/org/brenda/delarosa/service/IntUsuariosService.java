package org.brenda.delarosa.service;

import java.util.List;

import org.brenda.delarosa.model.Usuario;

public interface IntUsuariosService {

	public List<Usuario> obtenerTodas();
	public Usuario buscarPoId(Integer idUsuario);
	public void guardar(Usuario usuario);
	public void eliminar(Integer idUsuario);
}
