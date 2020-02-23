package sk.itlearning.java2.g.rozne;

import sk.itlearning.java2.a.db.Obcan;

public class Equals {

	public static void main(String[] args) {

		Obcan f1 = new Obcan("1", "P");

		Obcan f2 = new Obcan("1", "P");

		System.out.println(f1 == f2); // nespravne porovnavanie objektov

		System.out.println(f1.equals(f2));

		System.out.println(f1);

		System.out.println(f2);

	}

}
