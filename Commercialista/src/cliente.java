
public class cliente {
protected String cognome;
protected String nome ;
protected String CF;

public cliente()
{
cognome="cog";
nome="nom";
CF="XXXXXXX";
}
public cliente(String c ,String n ,String cf)
{
	cognome=c;
	nome=n;
	CF=cf;
}
public String getCognome() {
	return cognome;
}
public void setCognome(String cognome) {
	this.cognome = cognome;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCF() {
	return CF;
}
public void setCF(String cF) {
	CF = cF;
}

public  int calcolaQuota(){
	return 0;
}

}
