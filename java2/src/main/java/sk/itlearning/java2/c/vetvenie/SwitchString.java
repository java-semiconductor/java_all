package sk.itlearning.java2.c.vetvenie;

public class SwitchString {

	public static void main(String[] args) {

		String mesiac = Konstanty.MAREC;

		switch (mesiac) {
		case Konstanty.JANUAR:
			System.out.println("Priemerna teplota pre " + mesiac + " je 2 st.");
			break;
		case Konstanty.FEBRUAR:
			System.out.println("Priemerna teplota pre " + mesiac + " je 3 st.");
			break;
		default:
			System.out.println("Neznamy mesiac");
			break;
		}
	}

}
