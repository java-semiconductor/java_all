package sk.itlearning.java2.f.staticfinal;

public class Static {

	int i;
	public static int j;

	public static void main(String[] args) {

		System.out.println(j);

		System.out.println(new Static().i);

		String k;
		
		if (j == 0) {
			k = "";
		}
		
		k = "";
		
		System.out.println(k);
	}
	
	public void print() {
		System.out.println(i);
	}

}
