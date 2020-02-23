package sk.itlearning.java2.g.rozne;

public class Wrapper {

	public static void main(String[] args) {

		// Unboxing
		Integer integer1 = 7;
		int a = integer1;
		System.out.println(a);

		// Autoboxing
		Integer integer2 = 5;
		System.out.println(integer2);

		// Metody vo Wrapper triedach
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.valueOf("50"));

	}

}
