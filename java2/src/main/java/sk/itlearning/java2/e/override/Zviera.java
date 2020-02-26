package sk.itlearning.java2.e.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Zviera {

	Zviera urobNieco(Zviera x) throws IOException {
		System.out.println("som zviera s parametrom");
		return new Zviera();
	}

	public static void main(String[] args) {
		Zviera z = new Zviera();
		Pes p = new Pes();
		Zviera zp = new Pes();

		try {
			zp.urobNieco(z);
			zp.urobNieco(zp);
			zp.urobNieco(p);
		} catch (IOException e) {

		}
	}
}

class Pes extends Zviera {

	@Override
	public Pes urobNieco(Zviera x) throws FileNotFoundException {
		System.out.println("som pes zviera");
		return new Pes();
	}

	public Zviera urobNieco(Pes x) {
		System.out.println("som pes pes");
		return new Zviera();
	}

}