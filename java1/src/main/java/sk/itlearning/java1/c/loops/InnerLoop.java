package sk.itlearning.java1.c.loops;

public class InnerLoop {

	public static void main(String[] args) {

		int[] arrayOfInts = {2, 3, 5, 7, 9, 12, 17, 29, 45};

		for (int j = 0; j < arrayOfInts.length; j++) {

			for (int i = 1; i <= 5; i++) {
				if (arrayOfInts[j] == 9) {
					break;
				}
				System.out.print(" " + i);
			}

			System.out.println(" pre cislo: " + arrayOfInts[j]);
		}
	}

}
