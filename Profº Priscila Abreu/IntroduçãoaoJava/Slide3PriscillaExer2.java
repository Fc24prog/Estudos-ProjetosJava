package primeirosPassos;

import java.util.Scanner;

public class Slide3PriscillaExer2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner teclado = new Scanner(System.in);
    
    int idenficacao;
	String nome;
	float nota1,nota2,nota3,media,media_exercicios;
	
	System.out.println("Entre com o nome do aluno: ");
	nome=teclado.nextLine(); // (next) - só consigo ler a primeira palavra,(nextLine), consigo ler uma frase, um nome completo
	
	System.out.println("Entre com a identificação do aluno: ");
	idenficacao=teclado.nextInt();
	
	System.out.println("Entre com a 1ª nota: ");
	nota1=teclado.nextFloat();

	System.out.println("Entre com a 2ª nota: ");
	nota2=teclado.nextFloat();

	System.out.println("Entre com a 3ª nota: ");
	nota3=teclado.nextFloat();
	
	System.out.println("Entre com a media dos exercicios ");
	media_exercicios=teclado.nextFloat();
	

	media = (nota1 + nota2 * 2 + nota3* 3 + media_exercicios)/7;
	
	if (media > 9.0)
	{
		System.out.println("O conceito do aluno foi A. PARABÉNS,aprovado!! ");
	}
	else if ( media> 7.5 &&  media < 9.0 )
	{
		System.out.println("O conceito do aluno foi B. PARABÉNS, aprovado!! ");
	}
	else if ( media>= 6 &&  media < 7.5 )
	{
		System.out.println("O conceito do aluno foi C. PARABÉNS, aprovado!! ");
	}
	else if ( media>= 4 &&  media < 6 )
	{
		System.out.println("O conceito do aluno foi D, reprovado ");
	}
	   else
	  {
		System.out.println("O conceito do aluno foi E,reprovado ");
	  }
	System.out.println("O nome do aluno é: " + nome);
	System.out.println("O número de identificação do aluno é: " + idenficacao);
	System.out.printf("A media do aluno foi : %.2f\n " , media);
	System.out.println("suas notas foram: 1ª nota: " + nota1 + " 2ª nota : " + nota2 + " 3ª nota : " +nota3);
	System.out.printf("A media dos exercicios foi : %.2f\n" , media_exercicios);
	teclado.close();}}
   