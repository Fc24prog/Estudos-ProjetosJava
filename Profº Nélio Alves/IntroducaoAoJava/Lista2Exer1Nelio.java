package primeirosPassos;
import java.util.Scanner;

public class Lista2Exer1Nelio {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner teclado = new Scanner(System.in);
			 
			 int num;
			 
			 System.out.println("Entre com o número ");
			 num=teclado.nextInt();
			 
			 if (num < 0)
			 {
				 System.out.println("O numero informado é negativo: " + num);
		
			 } 
			 else 
			 {
				 System.out.println("O numero informado é positivo: " + num);
			 }
			  
			 teclado.close();
			 }}
	// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

