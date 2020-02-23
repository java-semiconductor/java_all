package sk.itlearning.java1.i.modifikatory1;

public class PristupRovnakyPackage {

	public static void main(String[] args) {

		TriedaPackage p1 = new TriedaPackage();

//		 p1.premennaPrivate = "nemozno pristupovat ku private clenu inej triedy";

		p1.premennaPackage = "ok"; // ok, sme v tom istom package

		p1.premennaProtected = "ok"; // ok, sme v tom istom package

		p1.premennaPublic = "ok"; // ok, ku public clenovi triedy mozno pristupovat odvsadial


		TriedaPublic p2 = new TriedaPublic();
		
		// p2.premennaPrivate = "nemozno pristupovat ku private clenu inej triedy";

		p2.premennaPackage = "ok"; // ok, sme v tom istom package

		p2.premennaProtected = "ok"; // ok, sme v tom istom package

		p2.premennaPublic = "ok"; // ok, ku public clenovi triedy mozno pristupovat odvsadial

	}

}
