package sk.itlearning.java2.c.vetvenie;

public class SwitchFallThrough {

	public static void main(String[] args) {

		int mesiac = 8;

		switch (mesiac) {
		case 1:
			System.out.println("Januar");
		case 2:
			System.out.println("Februar");
		case 3:
			System.out.println("Marec");
		case 4:
			System.out.println("April");
		case 5:
			System.out.println("Maj");
		case 6:
			System.out.println("Jun");
		case 7:
			System.out.println("Jul");
		case 8:
			System.out.println("August");
		case 9:
			System.out.println("September");
		case 10:
			System.out.println("Oktober");
		case 11:
			System.out.println("November");
		case 12:
			System.out.println("December");
		default:

		}
	}

}
