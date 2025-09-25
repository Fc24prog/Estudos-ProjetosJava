package orientacaoNelio;

import java.util.Scanner;
import orientacaoNelio.Retangulo;

public class PrincipalRetangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		
		System.out.print("Entre com a altura: ");
		ret.altura=teclado.nextFloat();
		
		System.out.print("Entre com a base: ");
		ret.base=teclado.nextFloat();
		
				
		ret.area();
		ret.perimetro();
		ret.diagonal();
		
		System.out.print("Saídas trigonometricas: " + ret);
		System.out.println();
		teclado.close();

	}

}
