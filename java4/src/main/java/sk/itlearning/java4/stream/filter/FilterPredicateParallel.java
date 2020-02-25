package sk.itlearning.java4.stream.filter;

import java.util.List;

import sk.itlearning.java4.stream.file.F2;

public class FilterPredicateParallel {

	public static void main(String[] args) {

		List<String> lines = F2.getBookLines();
		
		long count = lines.parallelStream().filter(l -> l.contains("</book>")).count();
		
		System.out.println(count);
	}

}