package sk.itlearning.java3.o.json;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;

import sk.itlearning.java3.n.csv.test.Firma;

public class Main {

	public static void main(String[] args) {

		InputStream is1 = Main.class.getResourceAsStream("firmy.json");
		
		StringWriter writer = new StringWriter();
		try {
			IOUtils.copy(is1, writer, StandardCharsets.UTF_8.name());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String theJsonFirma = writer.toString();
		
		System.out.println(theJsonFirma);
		
		Firma[] f1 = new Gson().fromJson(theJsonFirma, Firma[].class);
		
		Arrays.asList(f1).forEach(e -> System.out.println(e));
		
		
		InputStream is2 = Main.class.getResourceAsStream("firmy.json");
		
		Firma[] f2 = new Gson().fromJson(new InputStreamReader(is2), Firma[].class);
		
		Arrays.asList(f2).forEach(e -> System.out.println(e));
		
	}

}
