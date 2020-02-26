package sk.itlearning.java2.g.rozne;

public class Member {

	// 1 clenske premenne
	private int a;
	private static int b;

	// 2 clenske metody
	void a() { }

	static void b() { }

	// 3 konstruktory
	public Member(int x) {
		super();
	}
	
	public Member(double x) {
		super();
	}

	// 4 vnorene triedy
	// vnorena nestaticka - inner class
	class X {
		void test() {
			System.out.println("Print variable a from inner class Member.X : " + a);
			System.out.println("Print variable b from inner class Member.X : " + b);
		}
	}

	// vnorena staticka - static nested class
	static class Y {
		void test() {
			System.out.println();
			System.out.println("Print variable b from static nested class Member.Y : " + b);
		}
	}

	// 5 inicializacne bloky
	{
		a = 10;
	}

	static {
		String user = System.getenv("USERNAME");
		if (user == null) {
			b = 10;
		} else {
			b = 20;
		}
	}

}
