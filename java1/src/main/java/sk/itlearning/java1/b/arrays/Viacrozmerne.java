package sk.itlearning.java1.b.arrays;

class Viacrozmerne {

	public static void main(String[] args) {

		String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith", "Jones" } };

		System.out.println(names[0][0] + names[1][0]);

		System.out.println(names[0][2] + names[1][1]);

		System.out.println();

		for (String[] cc : names) {
			for (String vv : cc) {
				System.out.println(vv);
			}
		}

		String [] names2 [] = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith", "Jones" } };
		System.out.println(names2);
	}

}