package orientacaoPriscila;

import java.util.Scanner;

import orientacaoPriscila.Funcionario;

public class FuncionarioPrincipalPriscila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		Funcionario funcionario1 = new Funcionario("Pedro","Gomes", 3000.00);
		Funcionario funcionario2 = new Funcionario("Joana","Vieira",5000.00);

	    System.out.println("Dados do Pedro: " );
	    System.out.println("Nome: " + funcionario1.getNome() + " Sobrenome: "+ funcionario1.getSobrenome() +" Salario Anual R$: " 
	    + funcionario1.salarioAnual() + " Salario com 10% de aumento é R$: " + funcionario1.salarioPercent() + " O salario anul é R$: " 
	    		+ funcionario1.salarioAnual());
	   

	    System.out.println("Dados da Joana:  " );
	    System.out.println("Nome: " + funcionario2.getNome() + " Sobrenome: "+ funcionario2.getSobrenome() +
	    		 " Salario Anual R$: " + funcionario2.salarioAnual() + "Salario com 10% de aumento é R$: " + funcionario2.salarioPercent()+
	    		 " O salario anul é R$: " + funcionario2.salarioAnual());
	   	
	}}
