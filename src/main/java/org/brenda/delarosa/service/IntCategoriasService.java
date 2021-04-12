package org.brenda.delarosa.service;

import java.util.List;

import org.brenda.delarosa.model.Categoria;

public interface IntCategoriasService {
	public List<Categoria> obtenerTodas();
	public Categoria buscarPorId(Integer idCategoria);
	public void guardar(Categoria categoria);
}
