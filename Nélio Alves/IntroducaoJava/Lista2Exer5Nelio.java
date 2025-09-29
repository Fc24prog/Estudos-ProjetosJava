package primeirosPassos;

import java.util.Scanner;

public class Lista2Exer5Nelio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int codigo, quantidade;
		double preco = 0.0; 
		
		System.out.println("Entre com o codigo do produto: ");  codigo=sc.nextInt();	
		System.out.println("Entre com quantidade do produto: ");    quantidade=sc.nextInt();
		
		if(codigo == 1)
		{
			preco = quantidade * 4.00;
		}
		else if (codigo == 2)
		{
			preco = quantidade * 4.50;
		}
		else if (codigo == 3)
		{
			preco = quantidade * 5.00;
			
		}else if (codigo == 4)
		{
			preco = quantidade * 2.00;
		}
		else if (codigo == 5) {
		    preco = quantidade * 1.50;
		} 
		else 
		{
		    System.out.println("Código inválido.");
		}
        System.out.printf("O Preço Total a ser pago é : R$ %.2f\n",preco);

		sc.close();}}