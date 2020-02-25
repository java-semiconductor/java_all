package sk.itlearning.java2.d.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTo {

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

		try {
			FileWriter fw = new FileWriter(f, true);
			fw.append("Prvy riadok\n");
			fw.append("Druhy riadok\n");
			fw.append("Treti riadok" + System.lineSeparator());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
