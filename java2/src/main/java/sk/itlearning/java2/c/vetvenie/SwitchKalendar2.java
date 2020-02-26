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
			break;
		case December:
			break;
		case Februar:
			break;
		case Jul:
			break;
		case Jun:
			break;
		case Maj:
			break;
		case Marec:
			break;
		case November:
			break;
		case Oktober:
			break;
		case September:
			break;
		default:
			break;
		}
	}

}
