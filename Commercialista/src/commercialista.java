
public class commercialista {
	public cliente[] clienti = new cliente[3];

	public int calcolaIncasso() {
		int incasso = 0;
		for (cliente cli : clienti) {
			incasso += cli.calcolaQuota();
			// System.out.println(cli.calcolaQuota());
		}
		return incasso;
	}

	public static void main(String[] args) {
		commercialista c = new commercialista();

		dipendente dip = new dipendente("Raggiolini", "Alessiuccio", "RS324354gfdg");
		liberoProfessionista lib = new liberoProfessionista("Raggiolini", "Alessiuccio", "LD234DSG1234H",
				"043292754324", 12);
		imprenditore imp = new imprenditore("Francoisina", "Claireina", "GF23FDG1232H", "3734642890", 23,
				"CONFetto S.P.A.");

		c.clienti[0] = dip;
		c.clienti[1] = lib;
		c.clienti[2] = imp;
		int d = c.clienti[0].calcolaQuota();
		int l = c.clienti[1].calcolaQuota();
		int i = c.clienti[2].calcolaQuota();
		System.out.println(d);
		System.out.println(l);
		System.out.println(i);

		System.out.println(c.calcolaIncasso());

	} // fine main
}
