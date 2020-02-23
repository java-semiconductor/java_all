package sk.itlearning.java2.g.rozne;

public class VarArgs {

	public static void main(String... args) {
		System.out.println(sucetNcisiel(1, 2, 3, 4));
	}

	static private int sucetNcisiel(int... x) {
		int result = 0;
		for (int i : x) {
			result += i;
		}
		return result;
	}

}
