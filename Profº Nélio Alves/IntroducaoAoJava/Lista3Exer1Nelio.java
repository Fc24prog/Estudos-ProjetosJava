package primeirosPassos;

import java.util.Scanner;

public class Lista3Exer1Nelio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		 int senha;

		System.out.println("Entre com a senha: "); senha=sc.nextInt();
		
		while (senha != 2002)
		{
			System.out.println("Acesso negado, por favor retire - se imediatamente ");
			
			System.out.println("Entre com a senha: "); senha=sc.nextInt();

		}				
				System.out.println("Acesso permitido! Bem - vindo !  ");
				
		sc.close();}}
