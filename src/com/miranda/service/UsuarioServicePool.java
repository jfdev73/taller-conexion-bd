package com.miranda.service;

import java.util.List;

import com.miranda.entity.Usuario;
import com.miranda.repository.UsuarioRepositoryPoolJDBC;

public class UsuarioServicePool implements GenericService<Usuario, Integer>{
	
	private UsuarioRepositoryPoolJDBC repository = new UsuarioRepositoryPoolJDBC();

	@Override
	public List<Usuario> findAll() {
		return repository.findAll();
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
