package sk.itlearning.java3.b.memory;

public class StringBuffer {

	public static void main(String[] args) {
		
		java.lang.StringBuffer kniha1 = new java.lang.StringBuffer();
		
		for (int i = 0; i < 100_000; i++) {
			kniha1.append(String.valueOf(i));
		}
		
		System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);
		System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);
		System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
		
	}

}
