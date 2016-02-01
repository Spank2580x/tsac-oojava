package bufiulianeugen.pkg;

public class portoNavale {

	private String nome;
	private int numeroImbarcazioni;
	private double metriQuadri;
	private double metriQuadriD;

	public portoNavale() {
		nome = "default";
		numeroImbarcazioni = 0;
		metriQuadri = 50;
		metriQuadriD = 0;
	}

	public portoNavale(String n, int ni, double mq, double mqd) {
		nome = n;
		numeroImbarcazioni = ni;
		metriQuadri = mq;
		metriQuadriD = mqd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroImbarcazioni() {
		return numeroImbarcazioni;
	}

	public void setNumeroImbarcazioni(int numeroImbarcazioni) {
		this.numeroImbarcazioni = numeroImbarcazioni;
	}

	public double getMetriQuadri() {
		return metriQuadri;
	}

	public void setMetriQuadri(double metriQuadri) {
		this.metriQuadri = metriQuadri;
	}

	public double getMetriQuadriD() {
		return metriQuadriD;
	}

	public void setMetriQuadriD(double metriQuadriD) {
		this.metriQuadriD = metriQuadriD;
	}

}
