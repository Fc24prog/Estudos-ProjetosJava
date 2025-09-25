package orientacaoNelio;

import java.util.Scanner;
import orientacaoNelio.FuncionarioNelio;


public class PrincipalFuncionarioNelio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);

		        FuncionarioNelio f = new FuncionarioNelio();

		        // Entrada de dados
		        System.out.print("Entre com o nome do funcionário: ");
		        f.nome = sc.nextLine();

		        System.out.print("Entre coom o salario bruto: ");
		        f.salario_bruto = sc.nextDouble();

		        System.out.print(" Entre com o imposto: ");
		        f.imposto = sc.nextDouble();

		        // Mostrar os dados do funcionário
		        System.out.println("Funcionario: " + f);

		        System.out.print("Qual a porcentagem para aumentar o salario? ");
		        double porcent = sc.nextDouble();
		        
		        f.incrementacaoSalario(porcent);

		        System.out.println("Dados atualizados do funcionario : " + f);

		        sc.close();}}
