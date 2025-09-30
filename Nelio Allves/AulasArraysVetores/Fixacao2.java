package nelioArrays;

import java.util.Scanner;

public class Fixacao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 
			int quantidade;
			
			System.out.println("Entre com a quantidade dos dados: ");
			quantidade=sc.nextInt();
				
			float vet [] = new float [quantidade];
			
			for (int i =0; i<vet.length; i++)
			{
				System.out.println("Entre com o valor: ");
				vet[i]=sc.nextFloat();
			}
			float soma=0.0f;
			float media =0.0f;
			for (int i =0; i<vet.length; i++)
			{
				 soma+=vet[i];;
				 media = soma/ vet.length;
			}
      		System.out.printf("A soma é: %.2f\n", soma);	
			System.out.printf("A média é: %.2f\n", media);	
	 
		   sc.close();}}
