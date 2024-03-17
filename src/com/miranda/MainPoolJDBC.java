package com.miranda;

import java.util.List;

import com.miranda.entity.Usuario;
import com.miranda.service.GenericService;
import com.miranda.service.UsuarioService;
import com.miranda.service.UsuarioServicePool;

public class MainPoolJDBC {

	public static void main(String[] args) {
		GenericService<Usuario, Integer> service = new UsuarioServicePool();
		List<Usuario> usuarios = service.findAll();
		usuarios.forEach(System.out::println);
		
		Usuario findUsuario = service.findById(1);
		
		System.out.println("Usuario encontrado: "+findUsuario);

	}

}
