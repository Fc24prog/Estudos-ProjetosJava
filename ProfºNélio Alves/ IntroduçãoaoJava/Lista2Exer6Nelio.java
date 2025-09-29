package primeirosPassos;

import java.util.Scanner;

public class Lista2Exer6Nelio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int valor;
		
		System.out.println("Entre com o valor: "); valor=sc.nextInt();
		
		if (valor >= 0 && valor <= 25)
		{ 
			System.out.println("O valor se enconta no intervalo entre 0 e 25. O valor é: "  + valor);
		}
		else if (valor > 25 && valor <= 50)
		{
			System.out.println("O valor se enconta no intervalo entre 25 e 50. O valor é:  " + valor);
		}
		else if (valor > 50 && valor <= 75)
		{
			System.out.println("O valor se enconta no intervalo entre 50 e 75. O valor é:  " + valor);
		}
		else if (valor > 75 && valor <= 100)
		{
			System.out.println("O valor se enconta no intervalo entre 75 e 100. O valor é:  " + valor);
		}
		else
		{
				System.out.println("Fora do intervalor " + valor);
			
		}   sc.close();}}
		