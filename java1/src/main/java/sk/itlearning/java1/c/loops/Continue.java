package sk.itlearning.java1.c.loops;

class Continue {
	public static void main(String[] args) {

		int[] arrayOfInts = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < arrayOfInts.length; i++) {
			if (arrayOfInts[i] != 30) {
				System.out.println(arrayOfInts[i]);
			}
		}

	}

}
