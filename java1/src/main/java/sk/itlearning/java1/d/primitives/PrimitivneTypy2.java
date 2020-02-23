package sk.itlearning.java1.d.primitives;


public class PrimitivneTypy2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		byte bmax = 127; // (2 na 7) - 1

		short smax = 32767; // (2 na 15) - 1

		int imax = 256 * 256 * 256 * 128 - 1; // (2 na 31) - 1;
		System.out.println("int_max = " + imax);

		long lmax = 1024 * 1024 * 1024 * 1024 * 1024 * 1024 * 8 - 1;
		System.out.println("long_max = " + lmax);

		float f1 = 5;
		System.out.println(f1);

		float f2 = 5.555f;
		System.out.println(f2);

		double d1 = 5;
		System.out.println(d1);

		double d2 = 5.0;
		System.out.println(d2);

		char cmin1 = 0;
		char cmin2 = '\u0000';

		char cmax1 = 65535;
		char cmax2 = '\uffff';

		// znak @
		// 0*16na3 + 0*16na2 + 4*16na1 + 0*16na0
		char at = 64;
		at = '\u0040';
		at = '@';
		System.out.println(at);
		
		boolean bol = false;
		System.out.println(bol);
	}

}
