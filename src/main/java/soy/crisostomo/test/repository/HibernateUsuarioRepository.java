package soy.crisostomo.test.repository;

import java.util.List;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import soy.crisostomo.test.model.Usuario;

@Repository
@Transactional
public class HibernateUsuarioRepository implements UsuarioRepository {
	
	@Autowired
	private SessionFactory sf;
	
	@Override
	public List<Usuario> obtenerTodos(){
		List<Usuario> usuarios = null;
		/*
		Criteria criteria = sf.getCurrentSession().createCriteria(Usuario.class);
		usuarios = criteria.list();
		*/
		return usuarios;
	}
}
