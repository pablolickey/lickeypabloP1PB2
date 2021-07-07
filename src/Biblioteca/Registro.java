package Biblioteca;


public class Registro {
	private Integer id;
	private Estudiante estudiante;
	private Libro libro;
	private String tipo;
	
	
	public Registro(Integer id, Estudiante estudiante, Libro libro, TipoDeRegistro tipo) {			
			this.setId(id);
			this.setEstudiante(estudiante);
			this.setLibro(libro);
			this.setTipo(tipo);
	}
	
	public void prestarLibro(Integer librosPrestados) throws NoEstaDisponible, MuchosPrestamos {
		if(librosPrestados<2) {	
			if(!this.libro.getPrestamo()) this.libro.setPrestamo(true);
			else {
				throw new NoEstaDisponible();
			}
		}
		else throw new MuchosPrestamos();
	}
	
	public void devolverLibro(Registro buscado) throws NoSePresto, AlumnoChanta {
		if(buscado.estudiante.equals(this.estudiante) && buscado.libro.equals(this.libro)) {			
			if(this.libro.getPrestamo()) this.libro.setPrestamo(false);
			else throw new NoSePresto();
		}
		else throw new AlumnoChanta();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeRegistro tipo) {
		this.tipo = tipo.getTipo();
	}
	
}
