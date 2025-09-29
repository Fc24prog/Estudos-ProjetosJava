package primeirosPassos;
import java.util.Scanner;

public class Lista1Exer1Nelio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		
		int n1,n2,soma;

		System.out.println("Entre com o 1ª numero");
		n1=teclado.nextInt();

		System.out.println("Entre com o 2ª numero");
		n2=teclado.nextInt();
		
		teclado.close();
		
		soma = n1+n2;
		System.out.println("A soma é: " + soma);

		
		teclado.close();
		
	}

}
