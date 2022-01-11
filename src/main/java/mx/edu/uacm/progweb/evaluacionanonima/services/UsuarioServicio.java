package mx.edu.uacm.progweb.evaluacionanonima.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import mx.edu.uacm.progweb.evaluacionanonima.DTO.UsuarioRegistroDTO;
import mx.edu.uacm.progweb.evaluacionanonima.dominio.Usuario;


public interface UsuarioServicio extends UserDetailsService{

	public Usuario guardar(UsuarioRegistroDTO registroDTO);
	
	public String obtenerRol(String username);
	
	public List<Usuario> listarUsuarios();
	
}
