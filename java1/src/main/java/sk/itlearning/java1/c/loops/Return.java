package sk.itlearning.java1.c.loops;

public class Return {
	public static void main(String[] args) {

		int[] arrayOfInts = {2, 3, 5, 7, 9, 12, 17, 29, 45};

		System.out.println(obsahuje(arrayOfInts, 12));
	}

	public static boolean obsahuje(int[] pole, int x) {
		for (int i = 0; i < pole.length; i++) {
			if (pole[i] == x) {
				return true;
			}
		}
		return false;
	}

}
