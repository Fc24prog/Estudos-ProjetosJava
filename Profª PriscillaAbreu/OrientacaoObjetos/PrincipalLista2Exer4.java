package orientacaoPriscila;
import orientacaoPriscila.Lista2Exer4;
import java.util.Scanner;
public class PrincipalLista2Exer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista2Exer4 escola = new Lista2Exer4("Klinger Douglas"," 10150A" , 8.0, 9.9);
		System.out.println("Entrada Inicial do Aluno:");
		escola.exibirDados();
		
		Lista2Exer4 aluno2 = new Lista2Exer4(" Móisés Gomes"," 158A38C" , 0 , 9.9);
		System.out.println("Estado Inicial do Aluno:");
		aluno2.exibirDados();
		
		System.out.println("\n--- Modificando os dados do aluno 2: ---");

		System.out.println(" O aluno melhorou na primeira prova: " );
		aluno2.setNota1(9.0);
		aluno2.exibirDados();
		
		Lista2Exer4 aluno3 = new Lista2Exer4("João Miguel", "23a85p" ,5 ,8);
		aluno3.exibirDados();}}
