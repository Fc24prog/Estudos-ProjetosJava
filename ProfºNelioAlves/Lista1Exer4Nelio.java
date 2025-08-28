package primeirosPassos;

import java.util.Scanner;

public class Lista1Exer4Nelio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int numero_funcionario;
		float horas_trabalhadas, valor_porHora,salario;
		
		System.out.println("Entre com o numero do funcionario:");
		numero_funcionario=teclado.nextInt();

		System.out.println("Entre com as horas trabalhadas do funcionario:");
		horas_trabalhadas=teclado.nextFloat();
		
		System.out.println("Entre com o valor das horas trabalhadas do funcionario:");
		valor_porHora=teclado.nextFloat();
	
		salario = (horas_trabalhadas * valor_porHora);

		System.out.println("O numero do funcionario é: " + numero_funcionario);
		System.out.printf("O salario do funcionario é: R$ %.2f reais",salario);
		teclado.close();}}