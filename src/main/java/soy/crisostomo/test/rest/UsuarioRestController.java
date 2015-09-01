package soy.crisostomo.test.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import soy.crisostomo.test.model.Usuario;
import soy.crisostomo.test.repository.UsuarioRepository;

@Controller
@RestController("api/rest/usuarios")
public class UsuarioRestController {
	
	@Autowired
	private UsuarioRepository us;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Usuario> verUsuarios() {
		return us.obtenerTodos();
    }
}
