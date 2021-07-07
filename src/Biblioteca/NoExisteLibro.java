package Biblioteca;

public class NoExisteLibro extends Exception {
	public NoExisteLibro() {
		super("No existe un registro con este libro");
	}
}
