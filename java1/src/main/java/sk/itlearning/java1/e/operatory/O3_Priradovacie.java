package sk.itlearning.java1.e.operatory;

public class O3_Priradovacie {

	// = += -= *= /= %= &= |=

	public static void main(String[] args) {

		int a = 100;

		a = a - 1;
		System.out.println(a);

		a -= 1;
		System.out.println(a);

		boolean b = true;
		boolean c = false;

		b |= c;
		System.out.println(b);

		b &= c;
		System.out.println(b);

	}

}
