package sk.itlearning.java2.g.rozne;

import sk.itlearning.java2.a.db.Obcan;

public class Equals {

	public static void main(String[] args) {

		Obcan f1 = new Obcan("1", "P");

		Obcan f2 = new Obcan("1", "P");

		System.out.println(f1 == f2);

		String s1 = "text";
		
		String s2 = "text";
		
		System.out.println(s1 == s2);

	}

}
