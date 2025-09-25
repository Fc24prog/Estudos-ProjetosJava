package orientacaoNelio;

public class Produto {
	
	// O que o problema quer? Ler os dados de um produto em estoque
	
	private String nome;
	private double preco;
	private int quantidade_estoque;
	
			
	public Produto(String nome, double preco, int quantidade_estoque) 
	{
		this.nome = nome;
		this.preco = preco;
		this.quantidade_estoque = quantidade_estoque;
	}
	
	// o preço total é multiplicar o preço unitario (preco) pela a quantidade (quantidade_estoque)
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade_estoque() {
		return quantidade_estoque;
	}

	public void setQuantidade_estoque(int quantidade_estoque) {
		this.quantidade_estoque = quantidade_estoque;
	}

	public double totalEmEstoque()
	{
		return preco * quantidade_estoque;
	}
	
	// a quantidade no estoque vai receber ela mesmo, mais a quantidade no estoque que vou entrar, assim vai somar o total de quantidade que 
	//tem no estoque (entrada no estoque)
	
	public void adicionarProduto(int quantidade_estoque)
	{
		this.quantidade_estoque += quantidade_estoque;// quando eu coloco o this, eu estou me referindo que quero acessar ao atributo da classe e
		                        // não o que foi passado por parametro na função, 
	}
	// (saída do estoque)
	public void saidaEstoque(int quantidade_estoque)
	{
		this.quantidade_estoque -= quantidade_estoque;
	}
	public String toString()
	{
		return 	("O produto é: " + nome + " O valor do produto é: R$" + String.format("%.2f" ,  preco) + " a quantidade em estoque é: " + quantidade_estoque + 
				" total em estoque em forma de valor é: R$" + String.format("%.2f" ,  totalEmEstoque()));
	}
	 // String.format("%.2f" ,  totalEmEstoque() // é para colocar na formatação que quero 
}
