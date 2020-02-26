package sk.itlearning.java1.h.zakaznik;

public interface Zakaznik {

	String getId();
	
	default String getName() {
		return null;
	}
	
	public static String getClassName() {
		return "Zakaznik";
	}
	
}
