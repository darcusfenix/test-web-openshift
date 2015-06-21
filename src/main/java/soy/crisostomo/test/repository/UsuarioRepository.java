package soy.crisostomo.test.repository;

import java.util.List;

import soy.crisostomo.test.model.Usuario;

public interface UsuarioRepository {

	List<Usuario> obtenerTodos();

}