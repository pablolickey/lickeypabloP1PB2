package Biblioteca;

public class NoSePresto extends Exception {
	public NoSePresto() {
		super("Este libro no se ha prestado");
	}
}
