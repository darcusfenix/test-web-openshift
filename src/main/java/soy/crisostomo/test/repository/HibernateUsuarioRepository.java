package soy.crisostomo.test.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import soy.crisostomo.test.model.Usuario;

@Repository
@Transactional
public class HibernateUsuarioRepository implements UsuarioRepository {
	
	@Autowired
	private SessionFactory sf;
	
	@Override
	public List<Usuario> obtenerTodos(){
		List<Usuario> usuarios = null;
		usuarios = sf.getCurrentSession().createCriteria(Usuario.class).list();
		return usuarios;
	}
}
