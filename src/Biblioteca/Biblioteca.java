package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	private String nombre;
	public ArrayList<Registro>registros = new ArrayList<Registro>();
	
	public Biblioteca(String nombre) {
		this.setNombre(nombre);
	}

	public void agregarRegistro(Registro registro) {
		this.registros.add(registro);
	}

	public Integer cantidadDeRegistros() {
		return this.registros.size();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Registro buscarRegistro(Integer id) throws NoExisteLibro {
		
		for (Registro registro : registros) {
			
			if(registro.getId().equals(id)) {
				return registro;
			}

		}
		throw new NoExisteLibro();
	}

	public Integer cantidadDeLibrosPrestados(Estudiante estudiante) {
		Integer librosPrestados=0;
		Integer librosDevueltos=0;
		Integer libros=0;
		for (Registro registro : registros) {
			
			if(registro.getEstudiante().equals(estudiante) && registro.getTipo().equals(TipoDeRegistro.tipo1.getTipo()) ) {
				librosPrestados++;
			}
			
			if(registro.getEstudiante().equals(estudiante) && registro.getTipo().equals(TipoDeRegistro.tipo2.getTipo()) ) {
				librosDevueltos++;
			}
		}
		libros=librosPrestados-librosDevueltos;
		return libros;
	}
	
}
