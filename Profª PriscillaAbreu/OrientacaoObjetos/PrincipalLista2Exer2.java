package orientacaoPriscila;

import orientacaoPriscila.Lista2Exer2;

public class PrincipalLista2Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista2Exer2 livro1 = new Lista2Exer2("Deixe-me ser mulher", "Elisabeth Elliot", 2021,false);
		Lista2Exer2 livro2 = new Lista2Exer2("Quarto de Guerra", "Chris Fabry", 2015,true);
		
		livro1.exibirDados();
        System.out.println("--------------------------------");
		livro2.exibirDados();
		livro1.devolver();
		livro1.exibirDados();
		livro2.emprestar();
		livro2.exibirDados();
}}