package sk.itlearning.java2.c.vetvenie;

import sk.itlearning.java2.b.enums.Kalendar1;

public class SwitchKalendar1 {

	public static void main(String[] args) {

		String mesiac = Kalendar1.MAREC;

		switch (mesiac) {
		case Kalendar1.JANUAR:
			System.out.println("Priemerna teplota pre " + mesiac + " je 1 st.");
			break;
		case Kalendar1.FEBRUAR:
			System.out.println("Priemerna teplota pre " + mesiac + " je 2 st.");
			break;
		case Kalendar1.MAREC:
			System.out.println("Priemerna teplota pre " + mesiac + " je 3 st.");
			break;
		case Kalendar1.APRIL:
			System.out.println("Priemerna teplota pre " + mesiac + " je 4 st.");
			break;
		case Kalendar1.MAJ:
			System.out.println("Priemerna teplota pre " + mesiac + " je 5 st.");
			break;
		case Kalendar1.JUN:
			System.out.println("Priemerna teplota pre " + mesiac + " je 6 st.");
			break;
		case Kalendar1.JUL:
			System.out.println("Priemerna teplota pre " + mesiac + " je 7 st.");
			break;
		case Kalendar1.AUGUST:
			System.out.println("Priemerna teplota pre " + mesiac + " je 8 st.");
			break;
		case Kalendar1.SEPTEMBER:
			System.out.println("Priemerna teplota pre " + mesiac + " je 9 st.");
			break;
		case Kalendar1.OKTOBER:
			System.out.println("Priemerna teplota pre " + mesiac + " je 10 st.");
			break;
		case Kalendar1.NOVEMBER:
			System.out.println("Priemerna teplota pre " + mesiac + " je 11 st.");
			break;
		default:
			System.out.println("Neznamy mesiac");
			break;
		}
	}

}
