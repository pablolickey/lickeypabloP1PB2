package Biblioteca;

public class Historia extends Libro implements Fotocopiable {


	public Historia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
	}
	
	@Override
	public String puedoSerFotocopiado() {
		return super.getNombre();
	}
	
}
