package mx.edu.uacm.progweb.evaluacionanonima.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import mx.edu.uacm.progweb.evaluacionanonima.dominio.Curso;
import mx.edu.uacm.progweb.evaluacionanonima.dominio.Usuario;
import mx.edu.uacm.progweb.evaluacionanonima.services.CursoServices;
import mx.edu.uacm.progweb.evaluacionanonima.services.UsuarioServicio;



@Controller
public class RegistroControlador {

	@Autowired
	private CursoServices servicio;
	
	@Autowired
	private UsuarioServicio Usuarioservicio;
	
	@GetMapping("/login")
	public String iniciarSesion() {
		return "login";
	}
	
	@PostMapping("/login")
	public String verPaginaDeInicio() {
		return "redirect:/index";
	}
	
	
	@GetMapping("/lista")
	public String lista(Model modelo) {
		//modelo.addAttribute("usuarios", servicio.listarCurso());
		modelo.addAttribute("usuarios", Usuarioservicio.listarUsuarios());
		
		return "adminCatalogo";
		
	}
}
