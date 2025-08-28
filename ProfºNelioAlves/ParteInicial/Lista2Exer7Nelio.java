package primeirosPassos;

import java.util.Scanner;

public class Lista2Exer7Nelio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
float x,y;
		
		System.out.println("Entre com o 1ª valor: "); x=sc.nextFloat();
		System.out.println("Entre com o 2ª valor: "); y=sc.nextFloat();
		
		if (x> 0.0 && y > 0.0)
		{
			System.out.println("O valor se encontra no Q1: ");
		}
		
		else if (x < 0.0 && y > 0.0)
		{
			System.out.println("O valor se encontra no Q2: ");
		}
		
		else if (x < 0.0 && y < 0.0)
		{
			System.out.println("O valor se encontra no Q3: ");
		}
		
		else if (x > 0.0 && y < 0.0)
		{
			System.out.println("O valor se encontra no Q4: ");
		}
		
		else if (x == 0.0 && y ==  0.0)
		{
			System.out.println("ORIGEM ");
		}
		else if (x== 0.0)
		{
			System.out.println("Eixo Y ");
		}
		else
		{
			System.out.println("Eixo X ");
		}
		sc.close();}}
