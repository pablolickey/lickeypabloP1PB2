package Biblioteca;

import java.util.ArrayList;

import org.junit.Assert;

public class Registro {
	private Estudiante estudiante;
	private Libro libro;
	private Libro libro2;
	private Integer id;
	private Integer contadorRegistro=0;
	private ArrayList<Registro> registros = new ArrayList<Registro>();
	
	
	public Registro(Estudiante estudiante, Libro libro,Integer id) {
		if(!libro.getPrestamo()) {			
			this.estudiante=estudiante;
			this.libro=libro;
			this.libro2=libro2;
			this.id=id;
		}
	}
	
	public void AgregarRegistro(int id, Registro registro) {
		this.registros.add(id,registro);
	}
	
}
