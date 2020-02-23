package sk.itlearning.java1.e.operatory;

public class O5_Ternarny {

	private static String s1 = "hello";
	private static String s2 = "world";

	public static void main(String[] args) {

		if (s1 == null) {
			s1 = "null";
		} else {
			s1 = s1.toUpperCase();
		}
	
		System.out.println(s1);

		// uvedeny zapis mozme zjednodusit pomocou ternarneho operatora
		s2 = s2 == null ? "null" : s2.toUpperCase();
		
		System.out.println(s2);
		
		// vysledok ternarneho operatora musime pouzit !!!
		
	}

}
