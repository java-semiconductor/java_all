package sk.itlearning.java1.g.rozmienacka;

public class Main {

	static double[] nominal = new double[] { 500.00, 200.00, 100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01 };

	public static void main(String[] args) {

		double sumaA = 1857.50;
		int[] resultA = Rozmienacka.rozmenSumu(sumaA);
		vypisVysledok(resultA);

//		double sumaB = 1857.58;
//		int[] resultB = Rozmienacka.rozmenSumu(sumaB);
//		vypisVysledok(resultB);
	}

	private static void vypisVysledok(int[] vydavok) {
		for (int i = 0; i < nominal.length; i++) {
			System.out.println(nominal[i] + " - " + vydavok[i]);
		}
	}

}
