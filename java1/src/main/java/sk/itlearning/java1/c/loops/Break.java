package sk.itlearning.java1.c.loops;

class Break {
	public static void main(String[] args) {

		int[] arrayOfInts = {2, 3, 5, 7, 9, 12, 17, 29, 45};

		int searchFor = 12;

		int i;

		boolean foundIt = false;

		for (i = 0; i < arrayOfInts.length; i++) {
			if (arrayOfInts[i] == searchFor) {
				foundIt = true;
				break;
			}
		}

		if (foundIt) {
			System.out.println("Found " + searchFor + " at index " + i);
		} else {
			System.out.println(searchFor + " not in the array");
		}

	}

}
