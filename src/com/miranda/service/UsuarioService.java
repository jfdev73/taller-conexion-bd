package com.miranda.service;

import java.sql.SQLException;
import java.util.List;

import com.miranda.entity.Usuario;
import com.miranda.repository.GenericRepository;
import com.miranda.repository.UsuarioRepositoryJDBC;

public class UsuarioService implements GenericService<Usuario, Integer> {

	private GenericRepository<Usuario, Integer> repository = new UsuarioRepositoryJDBC();

	@Override
	public List<Usuario> findAll() {
		try {
			return repository.findAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void save(Usuario t) {
		// TODO Auto-generated method stub

	}

	@Override
	public Usuario findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

}
