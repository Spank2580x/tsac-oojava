package main.harbour;

/**
 * ************* * DA COMPLETARE * ************* *
 */
public class Gioco {
	private AeroPorto porto;

	public Gioco(AeroPorto a) {
		porto = a;
	}

	public boolean portoDistrutto() {
		return porto.getDimensioneSqMetersNonDistrutta() == 0;
	}

	public void setPorto(AeroPorto ap) {
		this.porto = ap;
	}

	public AeroPorto getPorto() {
		return porto;
	}
	
	public void attacco(Invasore invasori[]){
		for(Invasore inv: invasori){
			int potenzadifuoco = inv.potenzaFuoco();
			porto.addMetriQuadriDistrutti(potenzadifuoco * 2.5);
		}
	}
}
