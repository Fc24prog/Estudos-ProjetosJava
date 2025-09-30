package priscilaArrays;

import java.util.Scanner;

import priscilaArrays.Produto;

public class PrincipalProduto {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        
        int quantidade;
		
		System.out.println("Entre com a quantidade dos dados: ");
		quantidade=sc.nextInt();
		
		Produto [] produtos;
		produtos = new Produto[quantidade];

      	for (int i =0; i<quantidade; i++)
		{
      		produtos[i] = new Produto(); 
      		System.out.println("Informe o código do produto: ");
      		produtos[i].setCodigo(sc.nextInt());
      		sc.nextLine();
      		
      		System.out.println("Informe o nome do produto: ");
      		produtos[i].setNome_produto(sc.nextLine());
      		
      		System.out.println("Informe a unidade de medida do produto: ");
      		produtos[i].setUnidMedida(sc.nextLine());
      		
      		System.out.println("Informe o preço do produto: ");
      		produtos[i].setPreco(sc.nextDouble());
      		
      		System.out.println("Informe a quantidade em estoque do produto: ");
      		produtos[i].setQuantEstoque(sc.nextDouble());
		}
         	sc.close();
	
      	
      	System.out.println("\n**** Lista de produtos ****");
		
      	for(int i=0; i<produtos.length;i++)
      	{
      		System.out.println(produtos[i]);
      	}
      	
      	System.out.println("\n**** Media dos valores:  ****");
      	
      	double cont = 0.0;
      	
      	for(int i=0; i<produtos.length;i++) 
      	{ 	   
			    cont += produtos[i].getPreco();
		}
			
      	double media = cont / quantidade; 
			
			System.out.printf("A média da somas é: %.2f",media);
		    
		}}
