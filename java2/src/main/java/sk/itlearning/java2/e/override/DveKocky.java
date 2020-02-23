package sk.itlearning.java2.e.override;

public class DveKocky extends Kocka {

	@Override
	public double getObjem() {
		return super.getObjem() * 2;
	}

}
