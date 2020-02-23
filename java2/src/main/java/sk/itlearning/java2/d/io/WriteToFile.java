package sk.itlearning.java2.d.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		File f = new File("C:\\tmp\\subor.txt");

		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
        }

		// using try-with-resource to get automatic close of FileWriter
		try (FileWriter fw = new FileWriter(f, true)) {
			fw.append("Prvy riadok" + System.lineSeparator());
			fw.append("Druhy riadok" + System.lineSeparator());
			fw.append("Treti riadok" + System.lineSeparator());
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
