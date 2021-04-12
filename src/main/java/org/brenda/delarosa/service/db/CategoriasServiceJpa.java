package org.brenda.delarosa.service.db;

import java.util.List;
import java.util.Optional;

import org.brenda.delarosa.model.Categoria;
import org.brenda.delarosa.repository.CategoriasReporitory;
import org.brenda.delarosa.service.IntCategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CategoriasServiceJpa implements IntCategoriasService {

	@Autowired
	private CategoriasReporitory repoCategorias;
	
	@Override
	public List<Categoria> obtenerTodas() {
		// TODO Auto-generated method stub
		return repoCategorias.findAll();
	}

	@Override
	public Categoria buscarPorId(Integer idCategoria) {
		// TODO Auto-generated method stub
		Optional <Categoria> optional = repoCategorias.findById(idCategoria);
		if( optional.isPresent()){
		return optional.get();	
		}
		return null;
	}

	@Override
	public void guardar(Categoria categoria) {
		// TODO Auto-generated method stub

	}

}
