package sk.itlearning.java2.e.override;

public class Zviera {

	void urobNieco() {
		System.out.println("som zviera");
	}

	void urobNieco(Zviera x) {
		System.out.println("som zviera s parametrom");
	}

	public static void main(String[] args) {
		Zviera z = new Zviera();
		Pes p = new Pes();
		Zviera zp = new Pes();
		z.urobNieco();
		p.urobNieco();
		z.urobNieco(z);
		p.urobNieco(p);
		p.urobNieco(zp);
	}
}

class Pes extends Zviera {

	void urobNieco() {
		System.out.println("som pes");
	}

	void urobNieco(Zviera x) {
		System.out.println("som pes zviera");
	}

	void urobNieco(Pes x) {
		System.out.println("som pes pes");
	}

}