package sk.itlearning.java1.e.operatory;

public class O2_Aritmeticke {

	public static void main(String[] args) {

		// + - * / %

		// scitanie
		System.out.println(10 + 10);

		// + operator mozno pouzit aj pre spajanie (concatenation) retazcov
		System.out.println("abc" + "def");

		// pozor, ak sa vo vyraze vyskytuje reatazec, potom vsetky operandy za retazcom
		// budu brane ako retazce a + operator bude interpretovany ako concatenation (spajanie retazcov)
		System.out.println("x" + 10 + 20 + 30);

		// ak pouzijeme zatvorky, najprv sa vyhodnoti vyraz v zatvorke a ak sa v zatvorkach nevyskytuje retazec,
		// tak + operator bude brany ako matematicke scitanie
		System.out.println(10 + 20 + "x" + 10 + (20 + 30) + 40);

		// odcitanie
		System.out.println(10 - 5);

		// nasobenie
		System.out.println(10 * 10);

		// delenie
		System.out.println(10 / 7.0);

		// typicke vyuzitie opeatora % (modulo = zvysok po deleni)
		// telo cyklu for sa vykona tisickrat
		for (int i = 1; i <= 1000; i++) {
			// tato podmienka bude splnena iba kazdy 200ty cyklus, teda ked sa bude
			// hodnota riadiacej premennej i rovnat 200, 400...
			if (i % 200 == 0 ) {
				System.out.println(i);
			}
		}

	}

}
