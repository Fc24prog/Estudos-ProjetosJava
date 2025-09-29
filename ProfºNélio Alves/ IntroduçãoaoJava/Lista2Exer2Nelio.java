package primeirosPassos;

import java.util.Scanner;

public class Lista2Exer2Nelio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner teclado = new Scanner(System.in);
	    int num;
		  System.out.println("Entre com o número ");
		 num=teclado.nextInt();
		 
		 if(num%2==0)
		 {
			 System.out.println("O numero informado é PAR: " + num);
	
		 } 
		 else 
		 {
			 System.out.println("O numero informado é ÍMPAR: " + num);
		 }
		  
		 teclado.close();
		 }}