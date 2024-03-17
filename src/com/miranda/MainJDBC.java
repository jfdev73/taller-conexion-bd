package com.miranda;

import java.util.List;


import com.miranda.entity.Usuario;
import com.miranda.service.GenericService;
import com.miranda.service.UsuarioService;

public class MainJDBC {
	public static void main(String[] args) {
	
			GenericService<Usuario, Integer> service = new UsuarioService();
			List<Usuario> usuarios = service.findAll();
			usuarios.forEach(System.out::println);
			
			Usuario findUsuario = service.findById(1);
			
			System.out.println("Usuario encontrado: "+findUsuario);
			
		
		
	}

}
