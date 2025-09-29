package primeirosPassos;
import java.util.Scanner;

public class Slide3PriscillaExer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       Scanner teclado = new Scanner(System.in);
	       
	       int matricula;
	       String nomeProfessor;
	       double horas_trabalhadas, valor_porHora,salario;
	       
	        System.out.println("Entre com o nome do professor : ");
			nomeProfessor=teclado.nextLine(); 
			
			System.out.println("Entre com a matricula do professor:");
			matricula=teclado.nextInt();

			System.out.println("Entre com as horas trabalhadas do professor:");
			horas_trabalhadas=teclado.nextDouble();
			
			System.out.println("Entre com o valor das horas professor:");
			valor_porHora=teclado.nextDouble();


			salario= (valor_porHora *horas_trabalhadas);
			
			System.out.println("O nome do professor é: " + nomeProfessor + " Sua matricula é: " + matricula);
			System.out.println("As horas trabalhadas do professor foram: " + horas_trabalhadas 
					+ "O valor por hora é : " + valor_porHora);
			System.out.printf("O salario do professor é: R$ %.1f reais",salario);
			teclado.close();

					       
	}}
