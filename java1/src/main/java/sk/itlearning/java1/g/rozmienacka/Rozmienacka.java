package sk.itlearning.java1.g.rozmienacka;

public class Rozmienacka {

	public static int[] rozmenSumu(double suma) {

		// inicializacia poctu vydanych bankoviek na 0
		int[] vydavok = new int[15];

		// inicializacia jednotlivych typov bankoviek
		double[] nominal = new double[] { 500.00, 200.00, 100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01 };

		// vypocet vydavkov
		for (int i = 0; i < nominal.length; i++) {
			while (suma >= nominal[i]) {
				vydavok[i]++;
				suma -= nominal[i];
			}
		}

		return vydavok;
	}

}
