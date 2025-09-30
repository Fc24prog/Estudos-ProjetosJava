package nelioArrays;

import java.util.Scanner;

public class Fixacao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);

		int quantidade;
		
		System.out.println("Entre com a quantidade dos dados: ");
		quantidade=sc.nextInt();
			
		int vet [] = new int [quantidade];
		
		for (int i =0; i<vet.length; i++)
		{
			System.out.println("Entre com o valor: ");
			vet[i]=sc.nextInt();
		}	
		
			for (int i =0; i<vet.length; i++)
			{
		      	if (vet [i] < 0 )
			{
		      		System.out.printf("Os numeros negativos são: %d\n", vet[i]);	
		     }   }      				      		
		      		
		   sc.close();}}
