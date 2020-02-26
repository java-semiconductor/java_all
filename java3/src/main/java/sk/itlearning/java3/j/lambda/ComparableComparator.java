package sk.itlearning.java3.j.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableComparator {

	static class Tovar {

		LocalDate datumVyroby;

		public Tovar(LocalDate dv) {
			this.datumVyroby = dv;
		}

		@Override
		public String toString() {
			return datumVyroby.format(DateTimeFormatter.BASIC_ISO_DATE);
		}

	}

	public static void main(String[] args) {

		Integer[] cislaArray = { 1, 7, 4, 9, 3, 0, 4, 6, 2, 5, 8, 3 };

		List<Integer> cisla = Arrays.asList(cislaArray);

		System.out.println(cisla);

		Collections.sort(cisla);

		System.out.println(cisla);

		List<Tovar> tovar = new ArrayList<>();
		tovar.add(new Tovar(LocalDate.of(2016, 2, 11)));
		tovar.add(new Tovar(LocalDate.of(2016, 2, 1)));
		tovar.add(new Tovar(LocalDate.of(2016, 2, 8)));

		System.out.println(tovar);

//		Collections.sort(tovar, new Comparator<Tovar>() {
//			@Override
//			public int compare(Tovar o1, Tovar o2) {
//				return o1.datumVyroby.compareTo(o2.datumVyroby);
//			}
//		});
		
		Collections.sort(tovar, (o1, o2) -> o1.datumVyroby.compareTo(o2.datumVyroby));

		System.out.println(tovar);

	}

}
