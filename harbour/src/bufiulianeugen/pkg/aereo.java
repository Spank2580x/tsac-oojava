package bufiulianeugen.pkg;

public class aereo extends invasore {
	private int numArmamentiA;
	private int numArmamentiB;

	public aereo() {
		numArmamentiA = 1;
		numArmamentiB = 1;
	}

	public aereo(int arma, int armb) {
		numArmamentiA = arma;
		numArmamentiB = armb;
	}

	public int getNumArmamentiA() {
		return numArmamentiA;
	}

	public void setNumArmamentiA(int numArmamentiA) {
		this.numArmamentiA = numArmamentiA;
	}

	public int getNumArmamentiB() {
		return numArmamentiB;
	}

	public void setNumArmamentiB(int numArmamentiB) {
		this.numArmamentiB = numArmamentiB;
	}

	@Override
	public int calcolaP() {
		int res;
		res = 10 * numArmamentiA + 25 * numArmamentiB;
		return res;
	}

}
