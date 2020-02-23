package sk.itlearning.java1.e.operatory;

public class O3_Priradovacie {

	// = += -= *= /= %= &= |=

	public static void main(String[] args) {

		// zakladny priradovaci operator - premennej na pravej strane sa priradi
		// hodnota alebo vysledok vyrazu z lavej strany
		int a = 100;

		// pouzite operatora a nasledne priradenie
		a = a - 1;
		System.out.println(a);

		// zjednoduseny zapis pouzitia operator a nasledneho priradenia
		a -= 1;
		System.out.println(a);

		// rovnako pouzivame ostatne operatory z tejto skupiny
		String s = "Jano";
		s += " z Trnavy";
		System.out.println(s);

		boolean b = true;
		boolean c = false;

		b |= c;
		System.out.println(b);

		b &= c;
		System.out.println(b);

	}

}
