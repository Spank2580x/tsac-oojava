
public class dipendente extends cliente{

public dipendente()
	{
	cognome="cog";
	nome="nom";
	CF="XXXXXXX";
	}
public dipendente(String c ,String n ,String cf)
	{
		cognome=c;
		nome=n;
		CF=cf;
	}
@Override
public int calcolaQuota(){
	return 5000;//centesimi
}

}
