package sk.itlearning.java2.e.override;

public class Zviera {

	public Zviera urobNieco(Zviera x) {
		System.out.println("som zviera s parametrom");
		return new Zviera();
	}

	public static void main(String[] args) {
		Zviera z = new Zviera();
		Pes p = new Pes();
		Zviera zp = new Pes();

		zp.urobNieco(z);
		zp.urobNieco(zp);
		zp.urobNieco(p);
	}
}

class Pes extends Zviera {

	public Zviera urobNieco(Zviera x) {
		System.out.println("som pes zviera");
		return new Pes();
	}

	public Zviera urobNieco(Pes x) {
		System.out.println("som pes pes");
		return new Zviera();
	}

}