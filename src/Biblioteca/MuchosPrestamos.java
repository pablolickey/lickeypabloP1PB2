package Biblioteca;

public class MuchosPrestamos extends Exception {
	public MuchosPrestamos() {
		super("El estudiante debe devolver sus prestamos antes de poder sacar otro");
	}
}
