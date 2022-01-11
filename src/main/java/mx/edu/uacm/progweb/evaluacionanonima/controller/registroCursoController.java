package mx.edu.uacm.progweb.evaluacionanonima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.edu.uacm.progweb.evaluacionanonima.DTO.CursoRegistroDTO;
import mx.edu.uacm.progweb.evaluacionanonima.services.CursoServices;

@Controller
@RequestMapping("/registroActividad")
public class registroCursoController {

	private CursoServices cursoService;
	
	public registroCursoController(CursoServices cursoServices) {
		super();
		this.cursoService = cursoServices;
	}
	
	@ModelAttribute("curso")
	public CursoRegistroDTO nuevoRegistroCursoDTO() {
		return new CursoRegistroDTO();
	}
	
	@GetMapping
	public String mostrarFormularioRegistroCurso() {
		return "agregaActividad";
	}
	
	@PostMapping
	public String registrarCurso(@ModelAttribute("curso") CursoRegistroDTO cursoDTO) {
		//cursoService.guardarCurso(cursoDTO);
		return "redirect:/registro?exito";
	}
}
