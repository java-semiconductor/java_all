package sk.itlearning.java1.h.zakaznik;

public class Test {

	public static void main(String[] args) {

		Obcan o1 = new Obcan("11", "Jozef");
		Obcan o2 = new Obcan("11", "Jozef");
		
		Firma f1 = new Firma("1234", "IBM");
		Firma f2 = new Firma("234", "Dell");
		
		Zakaznik[] pob = {o1, o2, f1, f2, new Obec()};
		
		for (Zakaznik o : pob) {
			System.out.println(o);
		}
		
	}

}
