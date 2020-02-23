package sk.itlearning.java4.a.abc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatting {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);

		System.out.println();

		DateFormat df = new SimpleDateFormat("dd-MM-yyyy u");
		System.out.println(df.format(d));

		System.out.println();

		DateFormat df2 = DateFormat.getDateInstance(0, new Locale("sk", "SK"));
		System.out.println(df2.format(d));
	}

}
