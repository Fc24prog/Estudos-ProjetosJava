package trabalhoCassiaSantanaFranco;

import trabalhoCassiaSantanaFranco.Retangulo;

import java.util.Scanner;

public class MainRetangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
				Scanner teclado = new Scanner(System.in);
				
				Retangulo ret = new Retangulo();
		        ret.setAltura(10.0);
		        ret.setLargura(15.0);
		        
		        ret.calcularArea();
				ret.calcularPerimetro();
		        
		        System.out.println("Dados do 1º Retângulo:");
		        System.out.println(ret);
		        
		        System.out.println();

		        
		        Retangulo ret2 = new Retangulo();
		        ret2.setAltura(5.0);
		        ret2.setLargura(4.0);
		        ret2.calcularArea();
				ret2.calcularPerimetro();
		        
		        
		        System.out.println("Dados do 2º Retângulo:");
		        System.out.println(ret2);

		        

		        
		        
				

	}

}
