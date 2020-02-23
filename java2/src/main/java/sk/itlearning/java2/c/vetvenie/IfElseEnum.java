package sk.itlearning.java2.c.vetvenie;

import sk.itlearning.java2.b.enums.Kalendar;

public class IfElseEnum {

	public static void main(String[] args) {

		Kalendar mesiac = Kalendar.Marec;

		if (mesiac.equals(Kalendar.Januar)) {

			System.out.println("Priemerna teplota pre " + mesiac + " je 2 st.");

		} else if (mesiac.equals(Kalendar.Februar)) {

			System.out.println("Priemerna teplota pre " + mesiac + " je 3 st.");

		} else if (mesiac.equals(Kalendar.Marec)) {

			System.out.println("Priemerna teplota pre " + mesiac + " je 8 st.");

		} else if (mesiac.equals(Kalendar.April)) {

			System.out.println("Priemerna teplota pre " + mesiac + " je 13 st.");

		} else if (mesiac.equals(Kalendar.Maj)) {

			System.out.println("Priemerna teplota pre " + mesiac + " je 16 st.");

		} else {

			System.out.println("Neznamy mesiac");

		}

	}

}
