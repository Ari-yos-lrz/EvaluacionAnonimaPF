package mx.edu.uacm.progweb.evaluacionanonima.DTO;

public class CursoRegistroDTO {
	
	private String nombre;
	private String descripcionCorta;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcionCorta() {
		return descripcionCorta;
	}
	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}
	public CursoRegistroDTO(String nombre, String descripcionCorta) {
		super();
		this.nombre = nombre;
		this.descripcionCorta = descripcionCorta;
	}
	public CursoRegistroDTO() {
		
	}
	
	


}
