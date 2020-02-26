package sk.itlearning.java1.h.zakaznik;

public class Test {

	public static void main(String[] args) {

		Obcan o1 = new Obcan("11", "Jozef");
		Obcan o2 = new Obcan("11", "Jozef");
		
		Firma f1 = new Firma("1234", "IBM");
		Firma f2 = new Firma("2345", "Dell");
		
		Zakaznik[] pz = {o1, o2, f1, f2};
		
		for (Zakaznik o : pz) {
			System.out.println(o.getId());
		}
		
		Object[] po = {o1, o2, f1, f2};
		
		for (Object o : po) {
			if (o instanceof Obcan) {
				System.out.println( ((Obcan)o).getId());
			}
			if (o instanceof Firma) {
				System.out.println( ((Firma)o).getId());
			}
		}
		
		System.out.println(o1.equals(o2));
		
		
		
	}

}
