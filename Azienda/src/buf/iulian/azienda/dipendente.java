package buf.iulian.azienda;

public class dipendente {
String nome;
String cognome;
int anzianita;
contratto contract=new contratto();
public dipendente(String n,String c,int a){
	nome=n;
	cognome=c;
	anzianita=a;//per ogni anno di anzianità lo stipendio aumenta di 0.5%
}
public dipendente(){
	nome="nuovo nome";
	cognome="nuovo cognome";
	anzianita=0;
}
public double calcoloStipendio(){
	double val=contract.stipendioBase;
	double unit=val/100*0.5;
	val=val+(anzianita*unit);
	return val;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCognome() {
	return cognome;
}
public void setCognome(String cognome) {
	this.cognome = cognome;
}
public int getAnzianita() {
	return anzianita;
}
public void setAnzianita(int anzianita) {
	this.anzianita = anzianita;
}

}
