package bufiulianeugen.pkg;

public class gioco {
	private portoNavale nostroP;
	private invasore[] nostriI;

	public gioco() {
	}

	public gioco(portoNavale pn, invasore[] in) {
		nostroP = pn;
		nostriI = in;
	}

	public portoNavale getNostroP() {
		return nostroP;
	}

	public void setNostroP(portoNavale nostroP) {
		this.nostroP = nostroP;
	}

	public invasore[] getNostriI() {
		return nostriI;
	}

	public void setNostriI(invasore[] nostriI) {
		this.nostriI = nostriI;
	}

	public boolean isDestroyed() {
		if (nostroP.getMetriQuadri() <= 0)
			return true;
		else
			return false;
	}

	public void performAttack() {
		int danni = 0;// in metri quadri
		for (invasore inv : nostriI) {
			danni += (inv.calcolaP() * 1.5);
		}
		nostroP.setMetriQuadriD(nostroP.getMetriQuadriD()+ danni);
		nostroP.setMetriQuadri(nostroP.getMetriQuadri() - danni);
		System.out.println("-->"+ danni);
	}

	public int sequence() {
		int count = 0;

		while (!isDestroyed()) {
			performAttack();
			count++;
		}
		return count;
	}
}
