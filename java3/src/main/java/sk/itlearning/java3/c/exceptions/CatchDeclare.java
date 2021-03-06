package sk.itlearning.java3.c.exceptions;

import java.math.BigDecimal;

public class CatchDeclare {

	public static void main(String[] args) {

		BigDecimal a = new BigDecimal(10);

		System.out.println(a.divide(new BigDecimal(0)));

		CustomBigDecimal c = new CustomBigDecimal(10.0);

		try {
			c.divide(new CustomBigDecimal(0.0));
		} catch (DivisionByZeroException e) {
			e.printStackTrace();
		}

		System.out.println("... a program pokracuje dalej");
	}

	private static class CustomBigDecimal extends BigDecimal {
		
		private static final long serialVersionUID = 1L;

		public CustomBigDecimal(double d) {
			super(d);
		}
		
		public BigDecimal divide(CustomBigDecimal divisor) throws DivisionByZeroException {
			if (divisor.doubleValue() == 0.0) {
				throw new DivisionByZeroException();
			} else {
				return super.divide(new BigDecimal(divisor.doubleValue()));
			}
		}

	}

}
