package Biblioteca;

public class Libro {

	private Integer codigo;
	private String nombre;
	private String autor;
	private Boolean prestamo=Boolean.FALSE;
	
	public Libro(Integer codigo, String nombre, String autor) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.autor=autor;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Boolean getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(Boolean prestamo) {
		this.prestamo = prestamo;
	}
	
	
}
