package primeirosPassos;

import java.util.Scanner;

public class Lista2Exer4Nelio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float hora_inicial, hora_final, duracao; 
		
		System.out.println("Entre com a hora inicial: ");  hora_inicial=sc.nextFloat();	
		System.out.println("Entre com a hora final: ");    hora_final=sc.nextFloat();
		
		 // Se a hora final for maior que a hora inicial, o jogo terminou no mesmo dia:
		
		if (hora_final > hora_inicial)
		{
			duracao= hora_final - hora_inicial;
	     } 
		else { // Se a hora final for menor ou igual à hora inicial, o jogo terminou no dia seguinte: if (hora_final <= hora_inicial)
	            duracao = (24 - hora_inicial) + hora_final;
	        }
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		sc.close();
		}}