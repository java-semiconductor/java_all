package sk.itlearning.java4.a.abc;

import java.math.BigDecimal;

public class Cloning {
	
	public static void main(String[] args) {
	
		Obcan o = new Obcan("11", "Jozo");
		o.setKredit(new BigDecimal(100));

		System.out.println(o);

		Obcan o2 = o.clone();

		System.out.println(o2);
		
		Obcan o3 = Obcan.clone(o2);

		
	}
	
}
