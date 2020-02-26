package sk.itlearning.java1.e.operatory;

public class O6_Logicke {

	private static String s1;

	public static void main(String[] args) {

		// logicka spojka A (AND) (neskratene vyhodnocovanie - vyhodnocuju sa vzdy vsetky casti vyrazu v podmienke)
		if (s1 != null && s1.length() > 0) { // na tomto riadku programu moze nastat chyba
			System.out.println(s1.toUpperCase());
		} else {
			System.out.println("s1 je null");
		}
		
		int a = 5;
		
		System.out.println(++a);
		System.out.println(a);
		

	}

}
