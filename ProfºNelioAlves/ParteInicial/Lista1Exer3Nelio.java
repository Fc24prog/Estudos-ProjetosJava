package primeirosPassos;

import java.util.Scanner;

public class Lista1Exer3Nelio {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
	
	    int A,B,C,D,diferenca;
	
	    System.out.println("Entre com o valor de A:");
	    A=teclado.nextInt();

	    System.out.println("Entre com o valor de B:");
	    B=teclado.nextInt();

	    System.out.println("Entre com o valor de C:");
	    C=teclado.nextInt();

	    System.out.println("Entre com o valor de D:");
	    D=teclado.nextInt();
	
	    diferenca= (A*B- C*D);
	    System.out.println("A DIFERENÇA é: " + diferenca);
	    teclado.close();
	}}