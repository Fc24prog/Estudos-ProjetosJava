package primeirosPassos;

import java.util.Scanner;

public class Slide4PriscillaExer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner teclado = new Scanner(System.in);
	    int numero,fat;
	    
	    System.out.println("Entre com o número via teclado:");
	    numero=teclado.nextInt();
	    
	   fat = 1;
	  
	   if (numero==0)
	   { 
		   System.out.println("fatorial = 1");
	   }
	   else {
		   for (int i=1; i > numero; i--)
	     	{
		        fat*=i;
		    }
	   }
		
	   System.out.println("O fatorial do numero :" + numero + " é de: " + fat);
     	
     	
 	    teclado.close();}}