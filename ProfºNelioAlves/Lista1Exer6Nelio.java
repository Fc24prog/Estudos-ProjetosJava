package primeirosPassos;

import java.util.Scanner;

public class Lista1Exer6Nelio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		float A,B,C,D,areaTriangulo,areaTrapezio,areaQuadrado,areaRetangulo,areaCirculo, pi=(float) 3.14;
		
		
		System.out.println("Entre com o valor de A:");
		A=teclado.nextFloat();

		System.out.println("Entre com o valor de B:");
		B=teclado.nextFloat();

		System.out.println("Entre com o valor de C:");
		C=teclado.nextFloat();
		


		areaTriangulo = ((A*C)/2);
		areaCirculo= (pi* (C*C));
		areaTrapezio= ((A+B)*C)/2;
		areaQuadrado= B*B;
		areaRetangulo= A*B;
		
		System.out.printf("Letra a: Área do triangulo: %.3f \n" , areaTriangulo);
		System.out.printf("Letra b: Área do circulo: %.3f\n" ,areaCirculo);
		System.out.printf("Letra c: Área do trapezio: %.3f\n" , areaTrapezio);
		System.out.printf("Letra d: Área do quadrado: %.3f\n" , areaQuadrado);
		System.out.printf("Letra e: Área do retangulo: %.3f\n" , areaRetangulo);
		teclado.close();}}

