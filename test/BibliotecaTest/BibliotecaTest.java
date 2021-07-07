package BibliotecaTest;

import org.junit.Test;

import Biblioteca.AlumnoChanta;
import Biblioteca.Biblioteca;
import Biblioteca.Estudiante;
import Biblioteca.Geografia;
import Biblioteca.Historia;
import Biblioteca.Libro;
import Biblioteca.Matematicas;
import Biblioteca.MuchosPrestamos;
import Biblioteca.NoEstaDisponible;
import Biblioteca.NoExisteLibro;
import Biblioteca.NoSePresto;
import Biblioteca.Registro;
import Biblioteca.TipoDeRegistro;

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
		Libro libro= new Matematicas(codigo,nombre,autor);
		Assert.assertNotNull(libro);
	}
	
	
	@Test
	public void queSePuedaFotocopiarUnLibroDeHistoria() {
		Integer codigo=12346551;
		String nombre="Segunda Guerra Mundial";
		String autor="Alejandro Gomes";
		Historia libro= new Historia(codigo,nombre,autor);
		Assert.assertNotNull(libro);
		Assert.assertEquals(nombre, libro.puedoSerFotocopiado());
	}
	

	@Test
	public void queSePuedaFotocopiarUnLibroDeGeografia() {
		Integer codigo=184542;
		String nombre="Argentina y sus relieves";
		String autor="Manuel Rodriguez";
		Geografia libro= new Geografia(codigo,nombre,autor);
		Assert.assertNotNull(libro);
		Assert.assertEquals(nombre, libro.puedoSerFotocopiado());
	}
	
	
	@Test
	public void queSePuedaPrestarUnLibro() throws NoEstaDisponible, NoSePresto, MuchosPrestamos {
		String ayn="Juan Perez";
		String dni="41.254.187";
		Estudiante estudiante= new Estudiante(ayn,dni);
		
		Integer codigo=1234471;
		String nombre="Algebra y Geometria Analitica 1";
		String autor="Marcos Dias";
		Libro libro= new Geografia(codigo,nombre,autor);

		String nombreDeBiblioteca="Marechal";
		Biblioteca biblioteca= new Biblioteca(nombreDeBiblioteca);

		Integer id=1;
		Registro registro= new Registro(id,estudiante,libro,TipoDeRegistro.tipo1);
		Integer librosPrestados=biblioteca.cantidadDeLibrosPrestados(estudiante);
		registro.prestarLibro(librosPrestados);
		
		biblioteca.agregarRegistro(registro);
		
		Assert.assertTrue(libro.getPrestamo());
		Assert.assertEquals(1, biblioteca.cantidadDeRegistros(),0.1);
		Assert.assertEquals("Prestamo",registro.getTipo());
	}

	
	@Test
	public void queSePuedaDevolverUnLibro() throws NoEstaDisponible, NoSePresto, NoExisteLibro, AlumnoChanta, MuchosPrestamos {

		String ayn="Juan Perez";
		String dni="41.254.187";
		Estudiante estudiante= new Estudiante(ayn,dni);
		
		String ayn2="Rocio Marquez";
		String dni2="41.145.456";
		Estudiante estudiante2= new Estudiante(ayn2,dni2);
		
		Integer codigo=1234471;
		String nombre="Algebra y Geometria Analitica 1";
		String autor="Marcos Dias";
		Libro libro= new Geografia(codigo,nombre,autor);
		
		String nombreDeBiblioteca="Marechal";
		Biblioteca biblioteca= new Biblioteca(nombreDeBiblioteca);

		Integer id=1;
		Registro registro= new Registro(id,estudiante,libro,TipoDeRegistro.tipo1);
		Integer librosPrestados=biblioteca.cantidadDeLibrosPrestados(estudiante);
		registro.prestarLibro(librosPrestados);

		biblioteca.agregarRegistro(registro);
		
		Assert.assertTrue(libro.getPrestamo());
		Assert.assertEquals(1, biblioteca.cantidadDeRegistros(),0.1);
		
		Integer id2=2;
		Registro registro2= new Registro(id2,estudiante,libro,TipoDeRegistro.tipo2);
		Registro registroBuscado=biblioteca.buscarRegistro(id);
		registro2.devolverLibro(registroBuscado);
		biblioteca.agregarRegistro(registro2);
		
		Assert.assertFalse(libro.getPrestamo());
		Assert.assertEquals(2, biblioteca.cantidadDeRegistros(),0.1);
	}
	
	@Test(expected= MuchosPrestamos.class)
	public void queNoSePuedaPrestarUnLibroSiElEstudianteYaTieneDos() throws NoEstaDisponible, NoSePresto, MuchosPrestamos {
		String ayn="Juan Perez";
		String dni="41.254.187";
		Estudiante estudiante= new Estudiante(ayn,dni);
		
		Integer codigo=1234471;
		String nombre="Algebra y Geometria Analitica 1";
		String autor="Marcos Dias";
		Libro libro= new Matematicas(codigo,nombre,autor);
		

		Integer codigo2=123457;
		String nombre2="Algebra y Geometria Analitica 45";
		String autor2="Marcos Diass";
		Libro libro2= new Matematicas(codigo2,nombre2,autor2);
		

		Integer codigo3=1234473;
		String nombre3="Algebra y Geometria Analitica 3";
		String autor3="Marcos Dias";
		Libro libro3= new Matematicas(codigo3,nombre3,autor3);
		
		String nombreDeBiblioteca="Marechal";
		Biblioteca biblioteca= new Biblioteca(nombreDeBiblioteca);

		Integer id=1;
		Registro registro= new Registro(id,estudiante,libro,TipoDeRegistro.tipo1);
		Integer librosPrestados=biblioteca.cantidadDeLibrosPrestados(estudiante);
		registro.prestarLibro(librosPrestados);
		biblioteca.agregarRegistro(registro);
		
		Integer id2=2;
		Registro registro2= new Registro(id2,estudiante,libro2,TipoDeRegistro.tipo1);
		Integer librosPrestados2=biblioteca.cantidadDeLibrosPrestados(estudiante);
		registro2.prestarLibro(librosPrestados2);
		biblioteca.agregarRegistro(registro2);		
		
		Integer id3=3;
		Registro registro3= new Registro(id3,estudiante,libro3,TipoDeRegistro.tipo1);
		Integer librosPrestados3=biblioteca.cantidadDeLibrosPrestados(estudiante);
		registro3.prestarLibro(librosPrestados3);
		biblioteca.agregarRegistro(registro3);
		
	}
	
	
}
