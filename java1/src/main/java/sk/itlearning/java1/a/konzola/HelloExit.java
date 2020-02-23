package sk.itlearning.java1.a.konzola;

public class HelloExit {

	// spustit je mozne iba taky program, resp. taku triedu, ktora ma v sebe nasledovne definovanu metodu main
	public static void main(String[] args) {

		// nasleduju prikazy, ktore sa budu vykonavat od hora smerom dolu
		System.out.println("Hello World!");

		System.out.println("Hello World again!");

		// ked uz nenasleduje ziadny dalsi prikaz, program sa ukonci

		// program mozeme ukoncit aj skor nez pride nakoniec
		System.exit(0);

		// System.exit(navratovy_ciselny_kod) sa neodporuca pouzivat, iba v nevyhnutnych pripadoch

		// tento prikaz sa uz nevykona, program sa ukoncil cez System.exit(0);
		System.out.println("Hello World again again!");
	}

}