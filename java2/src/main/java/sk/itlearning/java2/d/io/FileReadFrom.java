package sk.itlearning.java2.d.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class FileReadFrom {

	public static void main(String[] args) {
		File f = new File("C:/tmp/subor.txt");

		if (!f.exists()) {
			return;
		}

		try (BufferedReader br = new BufferedReader(new FileReader(f));) {
			String line = null;
			while ((line = br.readLine()) != null) {
				if (line.contains("Prvy")) {
					System.out.println(line);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			Files.readAllLines(f.toPath()).stream().filter(p -> p.contains("Prvy")).forEach(r -> System.out.println(r));
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			Files.lines(f.toPath()).filter(p -> p.contains("Prvy")).forEach(r -> System.out.println(r));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			Files.lines(f.toPath()).parallel().filter(p -> p.contains("Prvy")).forEach(r -> System.out.println(r));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
