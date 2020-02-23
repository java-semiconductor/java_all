package sk.itlearning.java1.a.konzola;

public class HelloArguments {

	// program mozme spustit s 0 - n retazcovymi argumentmi
	public static void main(String[] args) {

		// premenna args je pole argumentov programu

		// k prvemu argumentu v poli pristupujeme s indexom 0,
		// preto polom prechadzame od nula po (pocet prvkov - 1)

		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		} else {
			System.out.println("Program nedostal pri spusteni ziadne argumenty");
		}

	}

}