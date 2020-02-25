package sk.itlearning.java1.b.arrays;

public class Jednorozmerne {

	public static void main(String[] nazov) {

		// inicializacia pola sposob 1/ urcenim poctu prvkov
		System.out.println("// inicializacia pola sposob 1/ urcenim poctu prvkov");
		int[] p1 = new int[5];

		for (int i = 0; i < p1.length; i++) {
			System.out.println(p1[i]);
		}

		// inicializacia pola sposob 2/ s pouzitim konstruktora a vymenovanim prvkov
		System.out.println("// inicializacia pola sposob 2/ s pouzitim konstruktora a vymenovanim prvkov");
		int[] p2 = new int[] { 1, 2, 3, 4, 5 };

		// klasicky for cyklus
		for (int i = 0; i < p2.length; i++) {
			System.out.println(p2[i]);
		}

		// inicializacia pola sposob 3/ vymenovanim prvkov, bez pouzitia konstruktora
		System.out.println("// inicializacia pola sposob 3/ vymenovanim prvkov, bez pouzitia konstruktora");
		int[] p3 = { 6, 7, 8, 9 };

		// enhanced for cyklus
		for (int i : p3) {
			System.out.println(i);
		}
		
		//Return.obsahuje( ... doplnit volanie metody

	}

}
