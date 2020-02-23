/*
 * Najjednoduchsi java program
 *
 */
package sk.itlearning.java1.a.konzola;

// V Jave sa musi kod, ktory sa ma vykonat, vzdy nachadzat v triede
public class HelloWorld {

	// spustit je mozne iba taky program, resp. taku triedu, ktora ma v sebe nasledovne definovanu metodu main
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	/*
	 * spustite tento program z prikazoveho riadku
	 *
	 * navod:
	 *
	 * 1/ treba zadat parameter -classpath alebo skratene -cp s cestou k ROOT priecinku
	 *
	 * 2/ ak sa nachadza trieda v package, musi sa zadat cela cesta vratane package,
	 *
	 * takzvana Qualified Name
	 *
	 * java -cp E:\Java\itlearning\java_project\bin sk.itlearning.java1.konzola1.Hello1
	 *
	 */
}
