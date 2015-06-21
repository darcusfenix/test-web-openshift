package soy.crisostomo.test.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import soy.crisostomo.test.model.Usuario;
import soy.crisostomo.test.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository ur;
	
	@Override
	public List<Usuario> obtenerTodos(){
		return ur.obtenerTodos();
	}
}
