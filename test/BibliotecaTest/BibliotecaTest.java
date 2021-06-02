package BibliotecaTest;

import org.junit.Test;

import Biblioteca.Estudiante;
import Biblioteca.Geografia;
import Biblioteca.Historia;
import Biblioteca.Libro;
import Biblioteca.Registro;

import org.junit.Assert;

public class BibliotecaTest {

	@Test
	public void queSePuedaCrearUnEstudiante() {
		String ayn="Juan Perez";
		String dni="41.254.187";
		Estudiante estudiante= new Estudiante(ayn,dni);
		Assert.assertNotNull(estudiante);
	}
	
	@Test
	public void queSePuedaCrearUnLibro() {
		Integer codigo=123456;
		String nombre="Algebra y Geometria Analitica 2";
		String autor="Marcos Dias";
		Libro libro= new Libro(codigo,nombre,autor);
		Assert.assertNotNull(libro);
	}
	
	@Test
	public void queSePuedaCrearUnRegistro() {
		Integer id=1;
		String ayn="Juan Perez";
		String dni="41.254.187";
		Estudiante estudiante= new Estudiante(ayn,dni);
		Integer codigo=123456;
		String nombre="Algebra y Geometria Analitica 2";
		String autor="Marcos Dias";
		Libro libro= new Libro(codigo,nombre,autor);
		libro.setPrestamo(Boolean.TRUE);
		Integer codigo2=1234471;
		String nombre2="Algebra y Geometria Analitica 1";
		String autor2="Marcos Dias";
		Libro libro2= new Libro(codigo2,nombre2,autor2);
		libro2.setPrestamo(Boolean.TRUE);
		Registro registro= new Registro(estudiante,libro,libro2,id);
		Assert.assertNotNull(registro);
	}
	
	@Test
	public void queSePuedaFotocopiarUnLibroDeHistoria() {
		Integer codigo=12346551;
		String nombre="Segunda Guerra Mundial";
		String autor="Alejandro Gomes";
		Historia libro= new Historia(codigo,nombre,autor);
		Assert.assertNotNull(libro);
		libro.fotocopiarLibro(Boolean.TRUE);
	}
	
	@Test
	public void queSePuedaFotocopiarUnLibroDeGeografia() {
		Integer codigo=184542;
		String nombre="Argentina y sus relieves";
		String autor="Manuel Rodriguez";
		Geografia libro= new Geografia(codigo,nombre,autor);
		Assert.assertNotNull(libro);
		libro.fotocopiarLibro(Boolean.TRUE);
	}
	
	
	
	
}
