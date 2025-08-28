package primeirosPassos;

import java.util.Scanner;

public class Lista1Exer5Nelio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int cod1,cod2,numero_pecas1,numero_pecas2;
		float valor_pecas1,valor_pecas2,Total;
		
		System.out.println("Entrada das peças 1:");
		
		System.out.println("Entre com o codigo da peça 1:");
		cod1=teclado.nextInt();

		System.out.println("Entre com o número de peças 1:");
		numero_pecas1=teclado.nextInt();
	
		System.out.println("Entre com o valor unitario de cada peça 1:");
		valor_pecas1=teclado.nextFloat();
	

        System.out.println("Entrada das peças 2:");
		
		System.out.println("Entre com o codigo da peça 2:");
		cod2=teclado.nextInt();
		
		System.out.println("Entre com o número de peças :");
		numero_pecas2=teclado.nextInt();
		
		System.out.println("Entre com o valor unitario de cada peça 2:");
		valor_pecas2=teclado.nextFloat();
		

        Total = numero_pecas1* valor_pecas1 + numero_pecas2* valor_pecas2;

		System.out.println("o total a ser pago é: " + Total);

		teclado.close();}}