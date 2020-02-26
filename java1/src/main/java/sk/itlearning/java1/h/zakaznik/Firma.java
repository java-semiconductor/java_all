package sk.itlearning.java1.h.zakaznik;

public class Firma implements Zakaznik {

	private String ico;

	private String nazov;

	public Firma(String ico, String nazov) { // Preco je toto zle?
		this.ico = ico;
		this.nazov = nazov;
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

	@Override
	public String getId() {
		return ico;
	}

}
