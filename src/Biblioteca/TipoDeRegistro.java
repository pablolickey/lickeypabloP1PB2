package Biblioteca;

public enum TipoDeRegistro {
	tipo1("Prestamo"),
	tipo2("Devolucion");
	
	private final String tipoDeRegistro;
	
	TipoDeRegistro(String tipo){
		this.tipoDeRegistro=tipo;
	}
	
	public String getTipo() {
		return tipoDeRegistro;
	}
	
}
