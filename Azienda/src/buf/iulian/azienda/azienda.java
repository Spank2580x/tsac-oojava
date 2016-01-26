package buf.iulian.azienda;

public class azienda {
String ragioneSociale;
dipendente mieiDip[]=new dipendente[21];

public azienda(String rs){
	ragioneSociale=rs;
}
public azienda(){
	ragioneSociale="null";
}
public double sommaStipendi(){
	double somma=0;
	for(dipendente dip:mieiDip){
		somma+=dip.calcoloStipendio();
	}
	return somma;
}
public dipendente dipendentiMaxStipendi(){
	dipendente maxdip[]=new dipendente[21];
	for(dipendente dip)
	return 0;
}
public String getRagioneSociale() {
	return ragioneSociale;
}
public void setRagioneSociale(String ragioneSociale) {
	this.ragioneSociale = ragioneSociale;
}

}
