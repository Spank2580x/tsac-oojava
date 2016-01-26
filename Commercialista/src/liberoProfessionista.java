
public class liberoProfessionista extends cliente{
private String PIVA;
private int numeroFatture;


public liberoProfessionista(){
	cognome="cog";
	nome="maw";
	CF="XXXXXXXXXX";
	PIVA="01234556";
	numeroFatture=0;
}
public liberoProfessionista(String c ,String n ,String cf,String iva,int nf)
{
	cognome=c;
	nome=n;
	CF=cf;
	PIVA=iva;
	numeroFatture=nf;
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

@Override
public int calcolaQuota(){
	return 5000+(50*numeroFatture);
}
}
