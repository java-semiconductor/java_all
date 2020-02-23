package sk.itlearning.java1.c.loops;

public class DoWhile {

	public static void main(String[] args) {

		int i = 10;
		int j = 10;

		System.out.println("while...");
		
		// blok cyklu while sa nemusi vykonat ani raz
		while (i < 0) {
			System.out.println(i);
			i--;
		}

		System.out.println("do while...");
		
		// s do while sa telo cyklu vzdy vykona min. jeden krat
		do {
			System.out.println(j);
			j--;
		} while (j < 0);

	}

}
