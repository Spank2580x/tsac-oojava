package main.harbour;

/**
 * ************* * DA COMPLETARE * ************* *
 */
public class UBoot extends Invasore {
	private int armaH;
	private int armaK;

	public UBoot() {
		armaH = 1;
		armaK = 1;
	}

	public UBoot(int h, int k) {
		armaH = h;
		armaK = k;
	}

	public int getArmaH() {
		return armaH;
	}

	public void setArmaH(int armaH) {
		this.armaH = armaH;
	}

	public int getArmaK() {
		return armaK;
	}

	public void setArmaK(int armaK) {
		this.armaK = armaK;
	}

	@Override
	public int potenzaFuoco() {
		int pf = 0;
		pf = 20 * armaK + 30 * armaH;
		return pf;
	}
}