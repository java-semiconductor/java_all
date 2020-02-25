package sk.itlearning.java3.d.generics;

import java.util.ArrayList;
import java.util.List;

public class G3_NedostOchrana {

	public static void main(String[] args) {

		List<Obcan> zList = new ArrayList<Obcan>();
		zList.add(new Obcan("33", "Jano"));
		zList.add(new Obcan("44", "Fero"));

		G0_Adder a = new G0_Adder();
		a.add(zList);

		for (Obcan i : zList) {
			System.out.println(i.getMeno());
		}
		
	}

}
