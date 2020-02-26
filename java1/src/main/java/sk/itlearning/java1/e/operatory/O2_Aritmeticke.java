package sk.itlearning.java1.e.operatory;

public class O2_Aritmeticke {

	public static void main(String[] args) {

		// + - * / %

		// scitanie
		System.out.println(10 + 10);

		// + operator mozno pouzit aj pre spajanie (concatenation) retazcov
		System.out.println("abc" + "def");

		System.out.println("x" + 10 * 20 + 30);
		
		// odcitanie
		System.out.println(10 - 5);

		// nasobenie
		System.out.println(10 * 10);

		// delenie
		System.out.println(10 / 7.0);

		// priklad pouzitia operatora modulo
		for (int i = 1; i <= 1000; i++) {
			if (i % 200 == 0 ) {
				System.out.println(i);
			}
		}

	}

}
