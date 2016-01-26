
package buf.iulian.azienda;

public class contratto {
    public int stipendioBase;//valore in centesimi di euro 
	public String nome;
	
	public contratto(int s,String n){
		stipendioBase=s;
		nome=n;
	}
	public contratto(){
		stipendioBase=900;
		nome="nomenonnoto";
	}
	public int getStipendioBase(){
		return stipendioBase;
	}
	public String getNome(){
		return nome;
	}
	public void setStipendioBase(int sb){
		stipendioBase = sb;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
