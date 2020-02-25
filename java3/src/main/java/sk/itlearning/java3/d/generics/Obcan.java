package sk.itlearning.java3.d.generics;

public class Obcan {

	private String rodneCislo;

	private String meno;

	public Obcan(String rodneCislo, String meno) {
		setRodneCislo(rodneCislo);
		setMeno(meno);
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
	
}
