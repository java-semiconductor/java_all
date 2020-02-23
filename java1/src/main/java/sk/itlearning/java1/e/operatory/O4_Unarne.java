package sk.itlearning.java1.e.operatory;

public class O4_Unarne {

	// + - ++ -- !

	public static void main(String[] args) {

		int a = 5;
		double b = 5.5;
		boolean e = true;

		// matematicke operatory operuju nad dvomi argmumentami naprikla a + b

		// unarne operatory operuju nad jednym argumentom

		// unarne plus nema prakticky vyznam
		System.out.println(+a);

		// unarne minus urobi matematicku operaciu *(-1), teda z kladneho cisla zaporne
		// a zo zaporneho kladne
		System.out.println(-a);

		// operator inkrementacie zvysi ciselnu hodnotu o jednotku
		// ak je pouzity za premennou, tak najprv sa "pouzije" premenna az potom sa zvysi jej hodnota
		System.out.println(a++);
		System.out.println(a);

		// operator inkrementacie na desatinnom cisle
		// ak je pouzity pred premennou, tak najprv sa zvysi jej hodnota, az potom
		// sa pouzije vysledok vyrazu po aplikovanie inkrementacie
		System.out.println(++b);
		System.out.println(b);

		// operator dekrementacie znizi cislenu hodnotu o jednotku
		System.out.println(--a);

		// premenna e ma hodnotu true
		System.out.println(e);

		// operator logicka negacia !
		// ak e je true, tak !e je false
		System.out.println(!e);

		// POZOR, iba operatory ++ a -- menia hodnotu premennej, pri ostatnych
		// operatoroch v premennej ostava povodna hodnota
	}

}
