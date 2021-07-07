package Biblioteca;

public class NoEstaDisponible extends Exception {
	public NoEstaDisponible() {
		super("Este libro no se encuentra disponible");
	}
}
