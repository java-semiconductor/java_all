package sk.itlearning.java4.stream.filter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPredicateLazy {

	public static void main(String[] args) {

		String relPath = "src/main/resources/sk/itlearning/java4/book/controller/book.xml";
		
		try {		
			System.out.println( Files.lines(Paths.get(relPath)).filter(l -> l.contains("</book>")).count() );
			
			List<String> bookLines = Files.lines(Paths.get(relPath)).filter(l -> l.contains("</book>")).collect(Collectors.toList());
			
			bookLines.forEach(r -> System.out.println(r));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}