package org.brenda.delarosa.service;

import java.util.List;

import org.brenda.delarosa.model.Vacante;

public interface IntVacantesService {
	//METODOS ABSTRACTOS
	public List<Vacante> obtenerTodas();
	public Vacante buscarPorId(Integer id);
	public void guardar(Vacante vacante);

}
