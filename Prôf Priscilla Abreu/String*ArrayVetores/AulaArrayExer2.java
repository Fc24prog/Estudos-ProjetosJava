package priscilaArrays;

import java.util.Arrays;

import java.util.Scanner;

public class AulaArrayExer2 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		int vetor[];
		vetor =  new int[10];
		
		for (int i = 0; i < vetor.length ; i++)
		{
			System.out.println("Entre com o numero " + i + ": ");
			vetor[i]=sc.nextInt();		
		}
		
		
		Arrays.sort(vetor);
		System.out.println(" \nNotas Ordenadas: " + Arrays.toString(vetor));
		
		int menor = vetor[0]; 
		int maior = vetor[vetor.length - 1];
		
		System.out.println("O menor número é: " + menor); 
		System.out.println("O maior número é: " + maior); 		
		
		
		sc.close();	}}

