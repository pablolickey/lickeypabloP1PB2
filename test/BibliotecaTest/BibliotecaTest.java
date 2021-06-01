package BibliotecaTest;

import org.junit.Test;

import Biblioteca.Estudiante;

import org.junit.Assert;

public class BibliotecaTest {

	@Test
	public void queSePuedaCrearUnEstudiante() {
		String ayn="Juan Perez";
		String dni="41.254.187";
		Estudiante estudiante= new Estudiante(ayn,dni);
		Assert.assertTrue(estudiante.getStatus());
	}
	
	
}
