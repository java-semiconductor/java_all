package sk.itlearning.java2.e.override;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(faktorial(3));
	}

	static public long faktorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * faktorial(n - 1);
		}
	}


}
