package orientacaoPriscila;

public class Lista2Exer2 {
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private boolean disponibilidade = true; // o livro já foi emprestado ? sim!
	
	public Lista2Exer2(String titulo, String autor, int anoPublicacao, boolean disponibilidade)
	{
		
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.disponibilidade = disponibilidade;
	}


	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo) 
	{
		this.titulo = titulo;
	}

	public String getAutor() 
	{
		return autor;
	}

	public void setAutor(String autor)
	{
		this.autor = autor;
	}

	public int getAnoPublicacao()
	{
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) 
	{
		this.anoPublicacao = anoPublicacao;
	}

	public boolean isDisponibilidade()
	{
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade)
	{
		this.disponibilidade = disponibilidade;
	}

	public boolean emprestar() { // O livro ainda já foi emprestado? Não (false), então posso fazer o emprestimo e 
		                                                                                     // retorno (true),pq foi sucesso o emprestimo 
	    if (this.disponibilidade)
	    {        
	        this.disponibilidade = false;            //   Se estiver disponível, muda o estado para emprestado (false)
	        System.out.println("-> Empréstimo realizado com sucesso.");
	        return true; // Sucesso na operação
	        
	    } 
	    else  // o livro já foi emprestado? sim! retorno this.disponibilidade= true, retorno false;
	    {
	       System.out.println("-> Lamento: O livro " + getTitulo()+ " já está emprestado.");
	        return false; // Falha na operação
	    }}
	public boolean devolver() // (Le-se: esse valor booleano é falso? !) 
	{
		if (this.disponibilidade == false) // o livro ainda está emprestado,logo preciso devolver e a sua disponibilidade é false.
		{
			this.disponibilidade = true; // nesse caso mostra que a pessoa devolveu o livro e o livro está disponivel para emprestar.
	        System.out.println("Devolução realizada com sucesso do livro: " + getTitulo());
	        return true;
		}
		else // como estou trabalhando com a devolução, se o livro já está na biblioteca, o this.disponibilidade = true. 
			   // logo o livro já está na biblioteca, não preciso devolver nada e nem tentar devolver, pois já se encontra disponivel
		{
			System.out.println("-> ERRO: O livro "+ getTitulo() + " já está disponível na biblioteca");
	        return false;
		}}
	public void exibirDados()
	{
		    String status = this.disponibilidade ? "Disponível" : "Emprestado";
		   
		    System.out.println("--------------------------------");
		    System.out.println("Título: " + this.titulo);
		    System.out.println("Autor: " + this.autor);
		    System.out.println("Ano de Publicação: " + this.anoPublicacao);
		    System.out.println("Status: " + status);
		    System.out.println("--------------------------------");
		}}