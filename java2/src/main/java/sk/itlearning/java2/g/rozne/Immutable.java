package sk.itlearning.java2.g.rozne;

import java.math.BigDecimal;

public class Immutable {

	static class MutableNumber {
		int value;

		public MutableNumber(int value) {
			this.value = value;
		}

		MutableNumber add(MutableNumber x) {
			return new MutableNumber(this.value + x.value);
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}
	}

	public static void main(String[] args) {

		MutableNumber a = new MutableNumber(100);

		a = a.add(new MutableNumber(50));

		System.out.println(a);


		BigDecimal b = new BigDecimal(100);

		b = b.add(new BigDecimal(50));

		System.out.println(b);
		
		String s = "text";
		
		s = s.toUpperCase();
		
		System.out.println(s);
	}

}
