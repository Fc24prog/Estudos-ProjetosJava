package priscilaArrays;

import java.util.Arrays;

import java.util.Scanner;

public class AulaArrayExer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		

		int vetor[];
		vetor =  new int[5];
		
		for (int i = 0; i < vetor.length ; i++)
		{
			System.out.println("Entre com o numero " + i + ": ");
			vetor[i]=sc.nextInt();		
		}
		
		int qualquer;
		
		System.out.println("Usuário entre com um numero qualquer: ");
		qualquer=sc.nextInt();	
		
       int contador = 0; 
		
		for (int i = 0; i < vetor.length; i++) 
		{
			if (vetor[i] == qualquer) 
			{
				contador++; 
				System.out.println("A quantidade de iguais são:  " + contador);
			}
				
		}
		sc.close();	}}

