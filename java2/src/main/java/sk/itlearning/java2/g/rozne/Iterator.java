package sk.itlearning.java2.g.rozne;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import sk.itlearning.java2.a.db.Obcan;

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
		
		Map<String, List<Obcan>> map = new TreeMap <> ();
		System.out.println(map);

	}

}
