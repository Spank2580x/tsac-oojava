package homework_01;

import java.io.Console;

public final class homework {
// 1  Dato un array di interi restituire la loro somma finche non si trova un valore nullo 

public static int sumWhilePos(int array[]){
	int sum=0;
	if(array.length==0)
		return 0;
	else{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>=0)
			{
				sum+=array[i];
			}
			else{
				break;
			}
		}
		return sum;
	}
	}
	
// 2  Dato un numero n, restituire la somma dei primi n numeri interi positivi dispari
	
public static int sumTillN(int n,int array[]){
	int sum=0;
	for(int i=0;i<n;i++)
	{
		if(array[i]>=0&&array[i]%2!=0)
		{
			sum+=array[i];
		}
		else 
			;
			
	}
	return sum;
}
	
//3   Dato un array di 10 elementi, calcolarne la media

public static float avgTen(int array[]){
	float sum=0;
	float res=0;
	for (int i = 0;i < 10; i++)
	{
		sum+=array[i];
	}
	res=sum/10;
	return res;
}

/*4   Dato un intervallo [a, b] con a e b due interi positivi, restituire la somma di tutti i numeri

compresi all’interno dell’intervallo, estremi inclusi. Nel caso che b fosse minore di a,

calcolare la somma nell’intervallo [b,a]*/

public static int sumInterval(int a,int b){
	int min =0;
	int max =0;
	int sum=0;
	if(b>a){
		max=b;
		min=a;
	}
	else {
		max=a;
		min=b;
	}
	for(int i=min;i<=max;i++){
		sum+=min;
		min++;
	}
	return sum;
}

	public static void main(String[] args) {
	int[] myarray= new int []{0,1,2,3,6,2,-4,8,11,-1};
	
	
	for (int i=0;i<myarray.length;i++)
	{
		System.out.println(myarray[i]);
	}

	System.out.println(sumWhilePos(myarray));//prova esercizio 1 
	System.out.println(sumTillN(6,myarray));//prova esercizio 2 
	System.out.println(avgTen(myarray));//prova esercizio 3
	System.out.println(sumInterval(5,2));//prova esercizio 4
	}	//fine main 
}//fine homework



