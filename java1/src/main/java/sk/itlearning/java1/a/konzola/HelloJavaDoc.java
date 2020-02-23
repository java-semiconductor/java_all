/*
 * Komentar moze byt kdekolvek v kode. Toto je viacriadkovy komentar.
 *
 * Ak je trieda zaradena v package, potom klucove slovo package
 * musi byt uvedene ako prva vec v subore.
 *
 * Pred klucovym slovom package moze byt komentar. Ten moze byt
 * naozaj umiestneny kdekolvek a pri kompilacii bude uplne zmazany.
 *
 */
package sk.itlearning.java1.a.konzola;

/**
 * <html><head><link href='https://fonts.googleapis.com/css?family=Sofia' rel='stylesheet'>
 *   <style>p{font-family: 'Sofia'; font-size: 22px;} body{font-size: 18px;}</style></head>
 *   <body>
 *     <h2>Komentárom typu "javadoc" sa dokumentujú triedy a metódy.</h2>
 *     <p>Vďaka možnosti použitia html kódu v komentári môžu byť tieto komentáre ľubovolne formátované.</p>
 *     <div>Formátovanie využívame hlavne kvôli sprehľadneniu komentára - dokumentácie.</div>
 *     <br/>
 *   </body>
 * </html>
 *
 * @author Marek Ladický
 *
 */
public class HelloJavaDoc {

	// Dve lomitka uvodzuju jednoriadkovy komentar.
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

}
