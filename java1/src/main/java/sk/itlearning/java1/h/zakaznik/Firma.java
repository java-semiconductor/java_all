package sk.itlearning.java1.h.zakaznik;

public class Firma extends Zakaznik {

	private String ico;

	private String nazov;

	public Firma(String a, String b) { // Preco je toto zle?
		ico = a;
		nazov = b;
	}

	public String getIco() {
		return ico;
	}

	public void setIco(String ico) {
		this.ico = ico;
	}

	public String getNazov() {
		return nazov;
	}

	public void setNazov(String nazov) {
		this.nazov = nazov;
	}

}
