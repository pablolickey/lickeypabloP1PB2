package Biblioteca;

public class Estudiante {


	private String DNI;
	private String  AyN;
	
	public Estudiante(String ayn, String dni) {
		this.setAyN(ayn);
		this.setDNI(dni);
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getAyN() {
		return AyN;
	}

	public void setAyN(String ayN) {
		AyN = ayN;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AyN == null) ? 0 : AyN.hashCode());
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		if (AyN == null) {
			if (other.AyN != null)
				return false;
		} else if (!AyN.equals(other.AyN))
			return false;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (!DNI.equals(other.DNI))
			return false;
		return true;
	}
}
