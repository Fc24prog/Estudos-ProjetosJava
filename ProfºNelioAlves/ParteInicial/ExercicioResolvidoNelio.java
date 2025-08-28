package primeirosPassos;

import java.util.Scanner;

public class ExercicioResolvidoNelio {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	float largura;
	float comprimento;
	double valorMetroQuadrado,area,preco;
	
	System.out.println("Entre com as medidas da largura: ");
	largura= sc.nextFloat();
	
	System.out.println("Entre com as medidas do comprimento: ");
	comprimento= sc.nextFloat();
	
	System.out.println("Entre com o valor do metro quadrado: ");
	valorMetroQuadrado= sc.nextDouble();
	
	sc.close();
	
	area = (largura*comprimento);
	preco= (area*valorMetroQuadrado);
	
	System.out.printf("Área é: %.2f m²%n", area);
	System.out.printf("Preço = R$ %.2f: " , preco);

	
	
}
}
