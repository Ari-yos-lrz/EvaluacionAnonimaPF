package mx.edu.uacm.progweb.evaluacionanonima.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import mx.edu.uacm.progweb.evaluacionanonima.DTO.CursoRegistroDTO;
import mx.edu.uacm.progweb.evaluacionanonima.dominio.Curso;




/*public interface CursoServices extends UserDetailsService{

	public Curso guardarCurso(CursoRegistroDTO cursoDTO);
	
	public List<Curso> listarCursos();

}*/
public interface CursoServices extends UserDetailsService{
	public List<Curso> listarCurso();
	
}