package org.brenda.delarosa.repository;

import org.brenda.delarosa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

}
