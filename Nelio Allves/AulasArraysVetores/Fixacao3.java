package nelioArrays;

import java.util.Scanner;

public class Fixacao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 	int quantidade;
			
			System.out.println("Entre com a quantidade dos dados: ");
			quantidade=sc.nextInt();
			sc.nextLine();
				
			String [] nome = new String [quantidade];
			int [] idade = new int [quantidade];
			double [] altura = new double [quantidade];
			
			
			for (int i = 0; i < quantidade; i++)
			{
				System.out.println("Dados da "+ i + " Pessoa: ");
				
				System.out.println("Entre com o nome da pessoa: : ");
				nome[i]=sc.nextLine();

				System.out.println("Entre com a idade de " + nome[i] + " : ");
				idade[i]=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Entre com a altura de " + nome[i] + " : ");
				altura[i] = sc.nextDouble();
				sc.nextLine(); 
			}
			double somaAlturas = 0.0f;
			int contMenores16 =0;
			
			for (int i = 0; i < quantidade; i++)

			{
				somaAlturas += altura[i]; // somando todas as alturas
				
				if (idade[i] < 16)
				{
					contMenores16++;  // conto somente as alturas menores que 16.
				}
				
			}
			float media = 0.0f;
			double portcent16 = 0.0f;
			media = ((float)somaAlturas/quantidade);
			
			portcent16 = ( (double) contMenores16 / quantidade ) * 100.0;
			System.out.printf("A altura média das pessoas é: %.2f \n ", media);
			System.out.printf("A porcentagem de pessoas com menos de 16 anos é:  %.2f ", portcent16);

            System.out.println("\nNomes dos menores de 16 anos:");

            for (int i = 0; i < quantidade; i++) 
            {
                if (idade[i] < 16) {
                    System.out.println("  " + nome[i]);
                }}
			sc.close();	
	
	}}
	       
	         
	                