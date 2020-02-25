package sk.itlearning.java3.a.reflection;

public class VypocetB implements Vypocet {

	int result;

	public VypocetB(int result) {
		this.result = result;
	}

	@Override
	public int vypocitaj() {
		return 20;
	}

}
