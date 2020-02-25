package sk.itlearning.java3.b.memory;

public class StringPool {

	public static void main(String[] args) {

		String vyskladanyString = "";

		for (int i = 0; i < 50_000; i++) {
			vyskladanyString += String.valueOf(i);
		}

		System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);
		System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);
		System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
		
		System.out.println(vyskladanyString.length());

	}

}
