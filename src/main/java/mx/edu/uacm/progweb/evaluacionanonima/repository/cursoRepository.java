package mx.edu.uacm.progweb.evaluacionanonima.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.edu.uacm.progweb.evaluacionanonima.dominio.Curso;



@Repository
public interface cursoRepository extends CrudRepository<Curso, Integer>{
	
}
/*public interface cursoRepository extends JpaRepository<Curso, Long>{

	//public Curso findByName(String nombre);
}*/
