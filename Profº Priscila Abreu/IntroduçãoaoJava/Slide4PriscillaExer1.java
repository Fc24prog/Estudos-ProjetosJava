package primeirosPassos;

import java.util.Scanner;

public class Slide4PriscillaExer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner teclado = new Scanner(System.in);

	       
	     int numeros,acumulador=0;
	     float media=0.0f;
	       
	      
			for (int i=1; i <= 10; i++)
	     	{
	           System.out.print("Digite o " + i + "º número inteiro: ");
			   numeros=teclado.nextInt();
			                                              
			   acumulador +=numeros; 	
	     	}
			
               media = (float)acumulador/10; 
	
			System.out.println("A média da turma é : " + media);
     	    teclado.close();}}
