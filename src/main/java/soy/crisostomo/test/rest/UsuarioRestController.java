package soy.crisostomo.test.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import soy.crisostomo.test.model.Usuario;
import soy.crisostomo.test.repository.UsuarioRepository;

@RestController
public class UsuarioRestController {
	
	@Autowired
	private UsuarioRepository us;


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody List<Usuario> verUsuarios() {
		return us.obtenerTodos();
    }


	@RequestMapping(value = "/", method = RequestMethod.POST)
	public @ResponseBody Usuario save(@RequestBody Usuario usr)
	{
		if (usr != null){
			us.save(usr);
		}
		return usr;
	}
}
