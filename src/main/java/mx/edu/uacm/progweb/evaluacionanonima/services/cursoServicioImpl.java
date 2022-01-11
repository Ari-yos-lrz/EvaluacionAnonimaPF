package mx.edu.uacm.progweb.evaluacionanonima.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import mx.edu.uacm.progweb.evaluacionanonima.DTO.CursoRegistroDTO;
import mx.edu.uacm.progweb.evaluacionanonima.dominio.Curso;
import mx.edu.uacm.progweb.evaluacionanonima.repository.cursoRepository;


@Service
public class cursoServicioImpl implements CursoServices{
	
	private cursoRepository cursoRepositorio;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Curso> listarCurso() {
		// TODO Auto-generated method stub
		return (List<Curso>) cursoRepositorio.findAll();
	}
	

	/*@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Curso guardarCurso(CursoRegistroDTO cursoDTO) {
		Curso curso = new Curso(cursoDTO.getNombre(),cursoDTO.getDescripcionCorta());
		return cursoRepositorio.save(curso);// TODO Auto-generated method stub
		
	}


	@Override
	public List<Curso> listarCursos() {
		// TODO Auto-generated method stub
		return cursoRepositorio.findAll();
	}
*/
	
	
	

}
