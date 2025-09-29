package primeirosPassos;
import java.util.Scanner;

public class Lista1Exer2Nelio {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner jk = new Scanner(System.in);

			final float  pi = 3.14f, area,raio,p;
			
			System.out.println("Entre com o valor do raio");
			raio=jk.nextFloat();
			
			jk.close();

			area = pi*(raio*raio);
			p=(2*pi*raio);

			System.out.printf("O valor da area é: %.4f \n", area);
			System.out.printf("O valor do perimetro é: %.4f",p);
	        jk.close();
	        }}


