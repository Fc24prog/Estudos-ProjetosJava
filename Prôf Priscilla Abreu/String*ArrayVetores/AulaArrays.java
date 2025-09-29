package priscilaArrays;

import java.util.Scanner;

public class AulaArrays {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int [] numeros = new int[10];
		int soma=0;
		
		for(int i=0; i<numeros.length;i++) 
		{
			System.out.println("Número: ");
			numeros[i] = sc.nextInt();
			soma += numeros[i];
			
		}
		System.out.println("Soma: "+soma);
		sc.close();
 }}
