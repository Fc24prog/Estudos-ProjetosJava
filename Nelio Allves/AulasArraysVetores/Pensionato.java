package nelioArrays;

import java.util.Scanner;

public class Pensionato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
        EstudantePensionato[] quartos = new EstudantePensionato[10]; 

		System.out.println("Entre com a quantidade de quartos que serão alugados:   ");
	    int quantidade_aluguel=sc.nextInt();
		sc.nextLine();
        
		for (int i = 1; i < quantidade_aluguel; i++)
		{
			System.out.println("Dados do  "+ i + "ª aluguel: ");
			
			System.out.println("Entre com o nome do estudante que está alugando o quarto: ");
			String nome=sc.nextLine();
			
			System.out.println("Entre com o Email do estudante que está alugando o quarto: ");
			String email=sc.nextLine();
			
			System.out.println("Entre com o número do quarto que o  estudante está alugando:  ");
			int quarto=sc.nextInt();
			sc.nextLine();
			
            quartos[quarto] = new EstudantePensionato(nome, email);
		}
			System.out.println("Quartos alugados:  ");

			for (int i = 0; i < quartos.length; i++) // quartos.length; vai percorrer somente os quartos alugados. 
			{
			    // Apenas imprime se a posição não estiver nula (ou seja, se foi alugada)
			    if (quartos[i] != null) 
			    {
			        // Imprime o número do quarto (índice) e os dados do estudante
			        System.out.println(i + ": " + quartos[i].toString());
			    }
			}
        sc.close();  }}