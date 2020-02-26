package sk.itlearning.java1.d.primitives;

public class PrimitivneTypy3 {

	public static void main(String[] args) {

		// implicitne (automaticke) pretypovanie int -> byte
		byte b = 127;

		// implicitne pretypovanie byte -> int
		int i = b;
		System.out.println(i);

		// explicitne (manualne) pretypovanie (musime zvazit pretecenie)
		b = (byte) i;

		// implicitne pretypovania pri operaciach
		System.out.println(10 / 3.0);

		// od java 7 mozme pouzit oddelovac tisicov
		System.out.println(9_876_543);
		
		// Unboxing
		int u = Integer.valueOf(10);
		System.out.println(u);

		// Autoboxing
		Integer a = 5;
		System.out.println(a);

		// Metody vo Wrapper triedach
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.valueOf("50"));

	}

}
