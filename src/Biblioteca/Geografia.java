package Biblioteca;

public class Geografia extends Libro implements Fotocopiable {
	
	public Geografia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
	}

	@Override
	public String puedoSerFotocopiado() {
		return super.getNombre();
	}
	
}
