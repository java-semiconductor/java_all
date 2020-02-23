package sk.itlearning.java2.c.vetvenie;

import sk.itlearning.java2.b.enums.Kalendar;

public class SwitchEnum {

	public static void main(String[] args) {

		Kalendar mesiac = Kalendar.Marec;
		

		switch (mesiac) {
		case Januar:
			System.out.println("Priemerna teplota pre " + mesiac + " je x st.");
			break;
		case April:
			System.out.println("Priemerna teplota pre " + mesiac + " je x st.");
			break;
		case August:
			System.out.println("Priemerna teplota pre " + mesiac + " je x st.");
			break;
		case December:
			System.out.println("Priemerna teplota pre " + mesiac + " je x st.");
			break;
		case Februar:
			System.out.println("Priemerna teplota pre " + mesiac + " je x st.");
			break;
		case Jul:
			System.out.println("Priemerna teplota pre " + mesiac + " je x st.");
			break;
		case Jun:
			System.out.println("Priemerna teplota pre " + mesiac + " je x st.");
			break;
		case Maj:
			System.out.println("Priemerna teplota pre " + mesiac + " je x st.");
			break;
		case Marec:
			System.out.println("Priemerna teplota pre " + mesiac + " je x st.");
			break;
		case November:
			System.out.println("Priemerna teplota pre " + mesiac + " je x st.");
			break;
		case Oktober:
			System.out.println("Priemerna teplota pre " + mesiac + " je x st.");
			break;
		case September:
			System.out.println("Priemerna teplota pre " + mesiac + " je x st.");
			break;
		default:
			System.out.println("Neznamy mesiac");
			break;
		}
	}

}
