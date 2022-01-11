package mx.edu.uacm.progweb.evaluacionanonima.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nombreCurso;
	
	@Column
	private String descripcionCurso;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombreCurso;
	}

	public void setNombre(String nombre) {
		this.nombreCurso = nombre;
	}

	public String getDescripcionCorta() {
		return descripcionCurso;
	}

	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCurso = descripcionCorta;
	}

	
	public Curso(Long id, String nombre, String descripcionCorta) {
		super();
		this.id = id;
		this.nombreCurso = nombre;
		this.descripcionCurso = descripcionCorta;

	}
	
	public Curso(String nombre, String descripcionCorta) {
		super();
		this.nombreCurso = nombre;
		this.descripcionCurso = descripcionCorta;

	}

	public Curso() {
		
	}
	
	
	
}
