package priscilaArrays;

public class Produto {
	
	private int codigo;
	private String nome_produto;
	private String unidMedida;
	private double preco;
	private double quantEstoque;
	
	public Produto() 
	{
	}

	public Produto(int codigo, String nome_produto, String unidMedida, double preco, double quantEstoque)
	{
		this.codigo = codigo;
		this.nome_produto = nome_produto;
		this.unidMedida = unidMedida;
		this.preco = preco;
		this.quantEstoque = quantEstoque;
	}

	public int getCodigo()
	{
		return codigo;
	}

	public void setCodigo(int codigo)
	{
		this.codigo = codigo;
	}

	public String getNome_produto() 
	{
		return nome_produto;
	}

	public void setNome_produto(String nome_produto)
	{
		this.nome_produto = nome_produto;
	}

	public String getUnidMedida() 
	{
		return unidMedida;
	}

	public void setUnidMedida(String unidMedida)
	{
		this.unidMedida = unidMedida;
	}

	public double getPreco() 
	{
		return preco;
	}

	public void setPreco(double preco) 
	{
		this.preco = preco;
	}

	public double getQuantEstoque() 
	{
		return quantEstoque;
	}

	public void setQuantEstoque(double quantEstoque)
	{
		this.quantEstoque = quantEstoque;
	}
	
	public String toString()
	{
		return " Nome do Produto: " +  nome_produto + 
                " Codigo do produto: " + codigo + 
	            " Unidade de medida: " + unidMedida + 
	            " Valor do produto: " + preco +
	             " Quantidade em Estoque: " + quantEstoque;
	}}


