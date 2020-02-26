package sk.itlearning.java3.p.singleton;

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		super();
	}
	
	public static Singleton getSingletonInstance() {
		return singleton;
	}
	
}
