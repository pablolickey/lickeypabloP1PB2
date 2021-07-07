package Biblioteca;

public class AlumnoChanta extends Exception {
	public AlumnoChanta() {
		super("El alumno intenta devolver un libro que no se le ha prestado");
	}
}
