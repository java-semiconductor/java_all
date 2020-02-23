package sk.itlearning.java1.i.modifikatory2;

import sk.itlearning.java1.i.modifikatory1.TriedaPublic;

public class PotomokTriedaPublic extends TriedaPublic {

	public static void main(String[] args) {

		PotomokTriedaPublic p2 = new PotomokTriedaPublic();

//		p2.premennaPrivate = "nemozno pristupovat ku private clenu inej triedy";

//		p2.premennaPackage = "ok"; // ok, sme v tom istom package

		p2.premennaProtected = "ok"; // ok, sme v tom istom package

		p2.premennaPublic = "ok"; // ok, ku public clenovi triedy mozno pristupovat odvsadial

	}

}
