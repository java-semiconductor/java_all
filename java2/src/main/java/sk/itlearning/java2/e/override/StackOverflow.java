package sk.itlearning.java2.e.override;

public class StackOverflow {

	/**
	 * java.lang.StackOverflowError ked pri volani rovnakej
	 * metody z predka zabudneme pouzit klucove slovo super!!!
	 */
	public static void main(String[] args) {
		DveKocky k2 = new DveKocky();
		System.out.println(k2.getObjem());
	}

}
