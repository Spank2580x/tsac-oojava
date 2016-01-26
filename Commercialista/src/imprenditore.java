
public class imprenditore extends cliente{
	private String PIVA;
	private int numeroFatture;
	private String ragioneSociale;
	
	public imprenditore(String c ,String n ,String cf,String iva,int nf,String rs)
	{
		cognome=c;
		nome=n;
		CF=cf;
		PIVA=iva;
		numeroFatture=nf;
		ragioneSociale=rs;
	}
	public imprenditore(){
		cognome="cog";
		nome="maw";
		CF="XXXXXXXXXX";
		PIVA="01234556";
		numeroFatture=0;
		ragioneSociale="nulla";
	}
	public String getPIVA() {
		return PIVA;
	}
	public void setPIVA(String pIVA) {
		PIVA = pIVA;
	}
	public int getNumeroFatture() {
		return numeroFatture;
	}
	public void setNumeroFatture(int numeroFatture) {
		this.numeroFatture = numeroFatture;
	}
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	@Override
	public int calcolaQuota(){
		if(numeroFatture<=100)
		{return 50000;}
		else
		return 50000+(100*(numeroFatture-100));
	}
}
