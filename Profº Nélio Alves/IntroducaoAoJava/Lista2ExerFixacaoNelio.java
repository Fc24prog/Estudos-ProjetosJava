package primeirosPassos;
import java.util.Scanner;

public class Lista2ExerFixacaoNelio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner teclado = new Scanner(System.in);
          
	       int num1,num2,num3;
	       
	        System.out.println("Entre com  1ª numero: ");
			num1=teclado.nextInt();

			System.out.println("Entre com o 2ª número: ");
			num2=teclado.nextInt();

			System.out.println("Entre com o 3ª número: ");
			num3=teclado.nextInt();
			
			teclado.close();

			if (num1 < num2 && num1 <num3)
			{
				System.out.println("O menor numero é o 1ª número " + num1);

			} // como o num1, já foi testado e se ele não for o menor dos 3 que cai nos no else
			else if (num2<num3)
				{
					System.out.println("O menor numero é o 2ª número " + num2);
	
				}
			else 
				{
					System.out.println("O menor numero é o 3ª número " + num3);

				} 
					
			}}