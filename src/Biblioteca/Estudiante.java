package Biblioteca;

public class Estudiante {

	private String DNI;
	private String  AyN;
	private Boolean Status=Boolean.FALSE;
	
	public Estudiante(String ayn, String dni) {
		this.AyN=ayn;
		this.DNI=dni;
		this.Status=Boolean.TRUE;
	}

	public Boolean getStatus() {
		return Status;
	}

	public void setStatus(Boolean status) {
		Status = status;
	}
	
}
