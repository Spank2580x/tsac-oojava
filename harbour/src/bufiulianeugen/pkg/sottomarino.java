package bufiulianeugen.pkg;

public class sottomarino extends invasore {
	private int numArmamenti;
	private int stazza;

	public sottomarino() {
		numArmamenti = 1;
		stazza = 3;
	}

	public sottomarino(int arm, int sta) {
		numArmamenti = arm;
		stazza = sta;
	}

	public int getNumArmamenti() {
		return numArmamenti;
	}

	public void setNumArmamenti(int numArmamenti) {
		this.numArmamenti = numArmamenti;
	}

	public int getStazza() {
		return stazza;
	}

	public void setStazza(int stazza) {
		this.stazza = stazza;
	}
	@Override
	public int calcolaP(){
		int res;
		res =numArmamenti*stazza;
		return res;
	}
	
}
