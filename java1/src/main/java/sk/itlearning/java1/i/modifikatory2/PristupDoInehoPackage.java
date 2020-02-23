package sk.itlearning.java1.i.modifikatory2;

import sk.itlearning.java1.i.modifikatory1.TriedaPublic;

public class PristupDoInehoPackage {

	public static void main(String[] args) {

//		TriedaPackage p1 = new TriedaPackage();

		TriedaPublic p2 = new TriedaPublic();

//		 p2.premennaPrivate = "nemozno pristupovat ku private clenu inej triedy";

//		 p2.premennaPackage = "nemozno pristupovat z ineho package ku clenu triedy, ktoreho pristup je package private";

//		 p2.premennaProtected = "nemozno pristupovat ku protected clenu v inom package, pristup ma iba potomok";

		p2.premennaPublic = "ok"; // ok, ku public clenovi triedy mozno pristupovat odvsadial
		
	}
	
}
