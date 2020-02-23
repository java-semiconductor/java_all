package sk.itlearning.java2.b.enums;

public enum Kalendar2 {
	
	Januar("Priemerna teplota pre Januar su 2 stupne"),
	Februar("Priemerna teplota pre Februar su 3 stupne"),
	Marec("Priemerna teplota pre Marec je 8 stupnov"),
	April("Priemerna teplota pre April je 13 stupnov"),
	Maj("Priemerna teplota pre Maj je 18 stupnov"),
	Jun("Priemerna teplota pre Jun je 22 stupnov"),
	Jul("Priemerna teplota pre Jul je 27 stupnov"),
	August("Priemerna teplota pre August je 26 stupnov"),
	September("Priemerna teplota pre September je 18 stupnov"),
	Oktober("Priemerna teplota pre Oktober je 10 stupnov"),
	November("Priemerna teplota pre November je 6 stupnov"),
	December("Priemerna teplota pre December su 2 stupne");

	private String priemTeplota; //premenne

	private Kalendar2(String priemTeplota) {   // konstruktory
		this.priemTeplota = priemTeplota;
	}

	public String getPriemTeplota() {   // metody
		return priemTeplota;
	}

}
