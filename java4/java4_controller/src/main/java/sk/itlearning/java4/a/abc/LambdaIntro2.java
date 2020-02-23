package sk.itlearning.java4.a.abc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import sk.itlearning.java4.a.abc.LambdaIntro2.Tovar;

public class LambdaIntro2 {

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

		Integer[] cislaArray = {1, 7, 4, 9, 3, 0, 4, 6, 2, 5, 8, 3};

		List<Integer> cisla = Arrays.asList(cislaArray);

		System.out.println(cisla);

		Collections.sort(cisla);

		System.out.println(cisla);
		
		Set<Integer> set = new HashSet<>();
		set.addAll(cisla);
		
		System.out.println(set);

		List<Tovar> tovar = new ArrayList<>();
		tovar.add(new Tovar(LocalDate.of(2016, 2, 11)));
		tovar.add(new Tovar(LocalDate.of(2016, 2, 1)));
		tovar.add(new Tovar(LocalDate.of(2016, 2, 8)));

		System.out.println(tovar);

//		 Collections.sort(tovar);
		
//		Comparator<Tovar> c = new Comparator<>() {
//			@Override
//			public int compare(Tovar a, Tovar b) {
//				return a.datumVyroby.compareTo(b.datumVyroby);
//			}
//		};
//		
//		Collections.sort(tovar, c);

		Collections.sort(tovar, (b, a) -> a.datumVyroby.compareTo(b.datumVyroby));
		
		System.out.println(tovar);
	}

}
