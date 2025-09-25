package orientacaoPriscila;

import orientacaoPriscila.Lista2Exer1;

import java.util.Scanner;

public class PrincipalLista2Exer1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	Scanner teclado = new Scanner(System.in);
	
	Lista2Exer1 geometria1 = new Lista2Exer1 (0, null);
	
    geometria1.setRaio(3.0);
    geometria1.setCor("Preto");
	geometria1.MostrarDados();
	
	System.out.println("\n---------Entrada via teclado do 1ª circulo: -----------------\n");

	System.out.print("Digite o novo valor do Raio: ");
	double novoRaio = teclado.nextDouble();
    geometria1.setRaio(novoRaio); // se eu não colocar esse comando, vai ler os dados do 1º circulo (raio 3 e cor preta)
    
	teclado.nextLine(); 

	System.out.print("Digite a nova Cor: ");
	String novaCor = teclado.nextLine();
    geometria1.setCor(novaCor);
	geometria1.MostrarDados();
	
	System.out.println("------Entrada do 2ª circulo: ----------------\n");
		
	Lista2Exer1 circulo2 = new Lista2Exer1 (25, "rosa");
    circulo2.MostrarDados();
    teclado.close();}}
	 