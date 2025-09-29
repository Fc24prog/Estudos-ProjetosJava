package nelioArrays;

import java.util.Scanner;

public class InicioNelioArrays {

	
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			int n;
			
			System.out.println("Entre com a quantidade de alturas para serem lidas: ");
			n=sc.nextInt();
			
			double vet[] = new double [n];
			double soma= 0.0;


			for (int i = 0; i< vet.length; i++)
			{
				System.out.println("Entre com a Altura: : ");
				vet[i]=sc.nextDouble();
			
				soma+=vet[i];
			}
			
			double media= soma /n;
			System.out.printf("A média é:  %.2f" , media);

		
		sc.close();

	}}

