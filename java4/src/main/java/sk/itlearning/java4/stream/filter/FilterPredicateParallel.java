package sk.itlearning.java4.stream.filter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class FilterPredicateParallel {

	public static void main(String[] args) {

		String relPath = "src/main/resources/sk/itlearning/java4/book/controller/book.xml";
		
		try {		
			
			Files.lines(Paths.get(relPath)).parallel().filter(l -> l.contains("</book>")).collect(Collectors.toList());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}