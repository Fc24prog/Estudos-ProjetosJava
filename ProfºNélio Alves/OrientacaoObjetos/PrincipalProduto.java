package orientacaoNelio;

import java.util.Scanner;

import orientacaoNelio.Produto;

public class PrincipalProduto {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner teclado = new Scanner(System.in);
			
			Produto produto = new Produto (null, 0, 0); // nessa caso estou comçando uma variavel do tipo produto, (do tipo da classe das operaçoes) 
			                                // e instanciando  o objeto quando eu coloco o "new"
			
			System.out.println("Entrando com os dados do produtos: ");
			System.out.print("Entre com o nome: ");
			produto.setNome(teclado.nextLine()); ; // aqui estou lendo o nome do produto e irei ter que armazenar dentro do objeto produto,
			                                // no campo nome
			
			System.out.print("Entre com o preço do produto: ");
		    produto.setPreco(teclado.nextFloat());
			
			System.out.print("Entre com a quantidade que tem no estoque desse produto: ");
			produto.setQuantidade_estoque(teclado.nextInt());
			
			System.out.println("Dados iniciais: " + produto);
			System.out.println();
			
			System.out.print("Entre com a quantidade de produtos para serem adicionados no estoque: ");
			int quantidade=teclado.nextInt(); // não preciso declarar lá em cima e sim aqui perto mesmo
			
			produto.adicionarProduto(quantidade); // aqui faz a  atualização da quantidade dentro do objeto produto 
			System.out.println("Dados com a nova entrada em estoque: " + produto);
			System.out.println();
			
			System.out.print("Entre com a quantidade de produtos para serem adicionados no estoque: "); // pode ser a mesma varaivel em entrada/saida
			quantidade=teclado.nextInt();                // só que as operaçoes que serão diferentes, isso  eu faço na hora de chamar os metodos  
			
			produto.saidaEstoque(quantidade); // aqui faz a  atualização da quantidade dentro do objeto produto 
			System.out.println("Dados com a nova saída do estoque: " + produto);
			System.out.println();
			
			
		teclado.close();
	}}


