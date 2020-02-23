package sk.itlearning.java2.f.staticfinal;

public class Static {

	int i;
	public static int j = 4; // globalna premenna

	public static void main(String[] args) {

		System.out.println(j);

		Static s = new Static();

		System.out.println(s.i);

		for (int k = 0; k < 5; k++) {
			System.out.println(k);
			// int k = 10;
		}

		int k = 5;
		System.out.println(k);

	}

}
