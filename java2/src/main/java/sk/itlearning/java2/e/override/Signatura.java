package sk.itlearning.java2.e.override;

/**
 * <h2>Definicia metody sa moze skladat zo 6 casti:</h2>
 * <li>modifikatory</li>
 * <li>navratovy typ</li>
 * <li>nazov metody</li>
 * <li>zoznam parametrov v zatvorkach</li>
 * <li>zoznam vynimiek</li>
 * <li>telo metody uzavrete v zlozenych zatvorkach</li>
 * <br/>
 *
 * <h2>Signatura metody sa sklada z dvoch casti:</h2>
 * <li>nazov metody</li>
 * <li>zoznam parametrov v zatvorkach</li>
 * <br/>
 *
 * <div style="color:red;line-height:24px;font-size:14px;">
 * <li>Dve metody s rovnakou signaturou nemozu v jednej triede existovat.</li>
 * <li>Trieda moze definovat metodu s rovnakou signaturou ako ma rodicovska, dedena trida - vtedy ide o OVERRIDE,
 * prepisanie funkcnosti zdedenej metody</li>
 * <li>Trieda moze definovat viacero metod s rovnakym nazvom, avsak musia sa lisit v parametroch -
 * v ich pocte, poradi alebo type. Vtedy sa jedna o OVERLOAD metody.</li>
 * </div>
 *
 * <br/>
 *
 * @author Marek Ladicky
 *
 */
public class Signatura {

	public static void main(String[] args) {

		Signatura s = new Signatura();

		System.out.println(s);
	}

	@Override
	public String toString() {
		return "Toto je regulerny override";
	}

	public String toString(int i) {
		return "Toto je regulerny overload - zmenila sa signatura";
	}

	// Toto by nefungovalo, metoda s rovnakou signaturou uz existuje, nestaci zmenit navratovy typ
//	private Integer toString() {
//		return "Pokus o overload zmenenim navratoveho typu";
//	}

}
