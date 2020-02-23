package sk.itlearning.java2.d.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) {
		File f = new File("C:\\tmp\\subor.txt");

		if (!f.exists()) {
			return;
        }

		// using try-with-resource to get automatic close of BufferedReader
		try (BufferedReader br = new BufferedReader(new FileReader(f));) {
			String line;
			while ( (line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
