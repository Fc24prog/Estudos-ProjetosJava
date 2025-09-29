package primeirosPassos;

import java.util.Scanner;

public class Lista3Exer2Nelio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		 int x,y;

		System.out.println("Entre com a coordenada X: "); 
		x=sc.nextInt();

		System.out.println("Entre com a coordenada Y: "); 
		y=sc.nextInt();

		while (x!=0 && y!=0)
		{
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
			
			else {
				System.out.println("O valor se encontra no Q4: ");
			}
			
						
			System.out.println("Entre com a coordenada X: "); 
			x=sc.nextInt();

			System.out.println("Entre com a coordenada Y: "); 
			y=sc.nextInt();}
		
		sc.close();}}
