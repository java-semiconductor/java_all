package sk.itlearning.java2.e.override;

public class DoubleCube extends Cube {

	@Override
	public double getObjem() {
		return super.getObjem() * 2;
	}

}
