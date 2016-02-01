package bufiulianeugen.pkg;

public class invasore {
	protected String codice;
	protected String modello;
	protected int P;

	public invasore() {
		codice = "0000";
		modello = "default";
		P = 10;
	}

	public invasore(String c, String m, int p) {
		codice = c;
		modello = m;
		P = p;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getP() {
		return P;
	}

	public void setP(int p) {
		P = p;
	}

	protected int calcolaP() {
		return 0;
	}

}
