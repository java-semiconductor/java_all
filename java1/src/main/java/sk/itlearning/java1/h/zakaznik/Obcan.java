package sk.itlearning.java1.h.zakaznik;

import java.util.Objects;

public class Obcan implements Zakaznik {

	String rodneCislo;

	private String meno;

	public Obcan(String rodneCislo, String meno) { // Preco je toto zle?
		setRodneCislo(rodneCislo);
		setMeno(meno);
	}

	public String getRodneCislo() {
		return rodneCislo;
	}

	public void setRodneCislo(String rodneCislo) {
		String rc = rodneCislo.replace("/", "");
		long rcl = Long.valueOf(rc);
		if (rcl % 11 == 0) {
			this.rodneCislo = rodneCislo;
		} else {
			throw new IllegalArgumentException("Zadali ste neplatne rodne cislo");
		}
	}

	public String getMeno() {
		return meno;
	}

	public void setMeno(String meno) {
		this.meno = meno;
	}

	// doplnit validaciaRodnehoCisla, override equals a hashCode
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Obcan) {
			Obcan obcan = (Obcan) obj;
			return Objects.equals(this.meno, obcan.meno) && Objects.equals(this.rodneCislo, obcan.rodneCislo);
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.meno, this.rodneCislo);
	}

	@Override
	public String getId() {
		return rodneCislo;
	}

}
