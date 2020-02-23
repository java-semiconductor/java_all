package sk.itlearning.java2.g.rozne;

public class MemberTest {

	public static void main(String[] args) {

		Member m = new Member(20);
		System.out.println(m.a);

		Member.X x = m.new X();
		x.test();

		Member.Y y = new Member.Y();
		y.test();

	}

}
