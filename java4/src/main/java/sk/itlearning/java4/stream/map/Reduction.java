package sk.itlearning.java4.stream.map;

import java.util.List;
import java.util.Optional;

import sk.itlearning.java4.book.controller.XmlCatalogLoader;
import sk.itlearning.java4.book.model.Book;

public class Reduction {

	public static void main(String[] args) {
		
		List<Book> list = XmlCatalogLoader.getFullCatagalog(XmlCatalogLoader.class.getResourceAsStream("book.xml")).getBook();
		
		Optional<Book> ops = list.stream()
				.filter(e -> e.getPrice() < 20f)
				.max( (a, b) -> Float.valueOf(a.getPrice()).compareTo(Float.valueOf(b.getPrice())));
		
		ops.ifPresent(v -> v.setPrice(100));
		
		ops.ifPresent(v -> System.out.println(v.getId()));
		ops.ifPresent(v -> System.out.println(v.getPrice()));
		
		Book b = ops.orElse(new Book());
		
		System.out.println(b);
		
		ops.ifPresent(v -> System.out.println(v.getPrice()));
		
		Book b2 = ops.get();
		
		System.out.println(b2);
		
	}
	
}
