package priscilaArrays;

import java.util.Arrays;

import java.util.Scanner;

public class AulaArrayExer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int quantidade;
		
		System.out.println("Quantos alunos a turma possui? ");
		quantidade=sc.nextInt();
		
		int alunos []= new int [quantidade];
		double nota;
		double soma=0.0;
		
		for (int i = 0; i < alunos.length ; i++)
		{
			System.out.println("Entre com a nota do " + i + "ª aluno: ");
			alunos[i]=sc.nextInt();	
			
			soma += alunos[i];
			
		}
		
		double media= soma /quantidade;;
		System.out.printf("A média é:  %.2f" , media);
		
		Arrays.sort(alunos);
		System.out.println(" \nNotas Ordenadas: " + Arrays.toString(alunos));
		
		sc.close();}}



