package Biblioteca;

public class Historia extends Libro {

	private Boolean impresion=Boolean.FALSE;

	public Historia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
	}
	
	public String fotocopiarLibro(Boolean impresion) {
		this.impresion=impresion;
		if(this.impresion) {
			return this.getNombre();
		}
		return null;
	}

}
