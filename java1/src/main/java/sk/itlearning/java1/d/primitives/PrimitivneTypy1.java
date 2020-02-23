package sk.itlearning.java1.d.primitives;


public class PrimitivneTypy1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// osem bitovy znamienkovy (signed) integer;
		// 7 bitov pre hodnotu, jeden bit pre znamienko;
		// default hodnota: 0
		// max hodnoty -(2 na 7) az (2 na 7) - 1
		byte b;

		// 16 bitovy signed integer;
		// default hodnota: 0
		// max hodnoty -(2 na 15) az (2 na 15) - 1
		short s;

		// 32 bitovy signed integer;
		// default hodnota: 0
		// max hodnoty -(2 na 31) az (2 na 31) - 1
		int i;

		// 64 bitovy signed integer;
		// default hodnota: 0
		// max hodnoty -(2 na 63) az (2 na 63) - 1
		long l;

		// 32 bitove cislo s pohyblivou desatinnou ciarkou s jednoduchou presnostou;
		// default hodnota: 0.0f
		float f;

		// 64 bitove cislo s pohyblivou desatinnou ciarkou s dvojitou presnostou;
		// default hodnota: 0.0d
		double d;

		char c; // default: '\u0000'

		boolean bol; // default: false
	}

}
