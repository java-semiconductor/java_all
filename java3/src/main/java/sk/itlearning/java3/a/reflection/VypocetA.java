package sk.itlearning.java3.a.reflection;

public class VypocetA implements Vypocet {

	int result;

	public VypocetA(int result) {
		this.result = result;
	}

	@Override
	public int vypocitaj() {
		return 10;
	}

}
