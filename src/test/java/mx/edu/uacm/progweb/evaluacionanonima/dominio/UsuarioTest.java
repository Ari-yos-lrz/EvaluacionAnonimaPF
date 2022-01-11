package mx.edu.uacm.progweb.evaluacionanonima.dominio;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import mx.edu.uacm.progweb.evaluacionanonima.DTO.UsuarioRegistroDTO;
import mx.edu.uacm.progweb.evaluacionanonima.repository.UsuarioRepositorio;

class UsuarioTest {
	
	/*private UsuarioRepositorio usuarioRepositorio;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder = null;
	

	/*@Test
	public void guardaAdmi() {
		UsuarioRegistroDTO admiDTO = new UsuarioRegistroDTO("admiApp@admi.uacm.edu","123456");
		Usuario admi = new Usuario(admiDTO.getEmail(),passwordEncoder.encode("1234"),Arrays.asList(new Rol("ROLE_ADMIN"))); 
		Usuario guardado = usuarioRepositorio.save(admi);
		
		assertNotNull(guardado);
		//assertNotNull(guardado.getId());
		
	}
	
	@Test
	public void guardaUsuario() {
		Usuario usuario = new Usuario("Pedro", "Quintanilla","Morales","17-001-2365","22","pedroQuintanilla@estudiante.uacm.edu",
				passwordEncoder.encode("1234"),Arrays.asList(new Rol("ROLE_USER")));
		assertNotNull(usuarioRepositorio.save(usuario));
	}*/

}
