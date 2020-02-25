package sk.itlearning.java1.h.zakaznik;

public class Obcan extends Zakaznik {

	private String rodneCislo;

	private String meno;

	public Obcan(String rodneCislo, String meno) { // Preco je toto zle?
		this.rodneCislo = rodneCislo;
		this.meno = meno;
	}

	public String getRodneCislo() {
		return rodneCislo;
	}

	public void setRodneCislo(String rodneCislo) {
		this.rodneCislo = rodneCislo;
	}

	public String getMeno() {
		return meno;
	}

	public void setMeno(String meno) {
		this.meno = meno;
	}
	
	// doplnit validaciaRodnehoCisla, override equals a hashCode

}
