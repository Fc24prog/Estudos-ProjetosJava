package primeirosPassos;

import java.util.Scanner;

public class Lista2Exer3Nelio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1,num2;
		 
		 System.out.println("Entre com o 1ª número ");
		 num1=teclado.nextInt();
		 
		 System.out.println("Entre com o 2ª número ");
		 num2=teclado.nextInt();
	
		if (num1 % num2 == 0 || num2 % num1 == 0 )
		{
			 System.out.println("Os numeros informados são multiplos entre si: ");

		}
		else 
		{ 
			System.out.println("Os numeros informados NÃO são multiplos entre si: ");

		}
		teclado.close();}}