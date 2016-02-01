package bufiulianeugen.pkg;

public class play {
	public static int dim = 3;

	public static void main(String[] args) {
		invasore[] myarr = new invasore[dim];// ____________creo invasori
		sottomarino sot1 = new sottomarino(6, 7);
		sot1.codice = "0001";
		sot1.modello = "xxxa";
		sot1.P = sot1.calcolaP();
		myarr[0] = sot1;
		sottomarino sot2 = new sottomarino(4, 5);
		sot1.codice = "0011";
		sot1.modello = "xxaa";
		sot1.P = sot1.calcolaP();
		myarr[1] = sot2;
		aereo aer1 = new aereo(4, 2);
		sot1.codice = "1000";
		sot1.modello = "axxx";
		sot1.P = sot1.calcolaP();
		myarr[2] = aer1;
		System.out.println(sot1.calcolaP());
		System.out.println(sot2.calcolaP());
		System.out.println(aer1.calcolaP());// _fine creazione invasori
		portoNavale mioPorto = new portoNavale("Porto Augusto", 12, 800, 0);// __creazione--il
																			// terzo
																			// parametro
																			// rappresenta
																			// le
																			// dimmensioni
																			// del
																			// porto
		gioco mioG = new gioco(mioPorto, myarr);// inserimento nel gioco
		int helper = mioG.sequence();
		System.out.println("ci sono voluti " + helper + " attacchi!");

	} // fine main
}
