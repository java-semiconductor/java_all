package sk.itlearning.java2.c.vetvenie;

import sk.itlearning.java2.b.enums.Kalendar2;

public class SwitchEnum2 {

	public static void main(String[] args) {

				Kalendar2 mesiac = Kalendar2.Jun;

		switch (mesiac) {
		case Januar: System.out.println(mesiac.getPriemTeplota());
			break;
		case April: System.out.println(mesiac.getPriemTeplota());
			break;
		case August: System.out.println(mesiac.getPriemTeplota());
			break;
		case December: System.out.println(mesiac.getPriemTeplota());
			break;
		case Februar: System.out.println(mesiac.getPriemTeplota());
			break;
		case Jul: System.out.println(mesiac.getPriemTeplota());
			break;
		case Jun: System.out.println(mesiac.getPriemTeplota());
			break;
		case Maj: System.out.println(mesiac.getPriemTeplota());
			break;
		case Marec: System.out.println(mesiac.getPriemTeplota());
			break;
		case November: System.out.println(mesiac.getPriemTeplota());
			break;
		case Oktober: System.out.println(mesiac.getPriemTeplota());
			break;
		case September: System.out.println(mesiac.getPriemTeplota());
			break;
		default:
			System.out.println("Neznamy mesiac");
			break;
		}
	}

}
