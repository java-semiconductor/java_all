package sk.itlearning.java2.g.rozne;

import java.util.ArrayList;
import java.util.List;

public class Iterator {

	public static void main(String[] args) {

		List<Integer> cisla = new ArrayList<Integer>();

		cisla.add(1);
		cisla.add(2);
		cisla.add(3);

		java.util.Iterator<Integer> i = cisla.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
