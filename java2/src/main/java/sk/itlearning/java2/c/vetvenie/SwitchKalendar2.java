package sk.itlearning.java2.c.vetvenie;

import sk.itlearning.java2.b.enums.Kalendar2;

public class SwitchKalendar2 {

	public static void main(String[] args) {

		Kalendar2 mesiac = Kalendar2.Marec;

		switch (mesiac) {
		case Januar:
			System.out.println("Priemerna teplota pre " + mesiac + " je 1 st.");
			break;
		case April:
			System.out.println("Priemerna teplota pre " + mesiac + " je 2 st.");
			break;
		case August:
			System.out.println("Priemerna teplota pre " + mesiac + " je 3 st.");
			break;
		case December:
			System.out.println("Priemerna teplota pre " + mesiac + " je 4 st.");
			break;
		case Februar:
			System.out.println("Priemerna teplota pre " + mesiac + " je 5 st.");
			break;
		case Jul:
			System.out.println("Priemerna teplota pre " + mesiac + " je 6 st.");
			break;
		case Jun:
			System.out.println("Priemerna teplota pre " + mesiac + " je 7 st.");
			break;
		case Maj:
			System.out.println("Priemerna teplota pre " + mesiac + " je 8 st.");
			break;
		case Marec:
			System.out.println("Priemerna teplota pre " + mesiac + " je 9 st.");
			break;
		case November:
			System.out.println("Priemerna teplota pre " + mesiac + " je 10 st.");
			break;
		case Oktober:
			System.out.println("Priemerna teplota pre " + mesiac + " je 11 st.");
			break;
		case September:
			System.out.println("Priemerna teplota pre " + mesiac + " je 12 st.");
			break;
		default:
			System.out.println("Neznamy mesiac");
			break;
		}
	}

}
