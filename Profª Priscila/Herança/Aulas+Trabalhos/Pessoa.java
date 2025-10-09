package estudoSobreHerança;

public class Pessoa {
	
	private String nome,cpf;
	private Data dtNasc;
	
	public Pessoa() 
	{ }
	
	public Pessoa(String nome, String cpf, Data dtNasc) 
	{
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dtNasc = dtNasc;
	}
	public Pessoa(String nome, String cpf, int d, int m, int a ) // nesse construtor estamos passando d,m,a e 
	                                                       // instanciando na data;
	{
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dtNasc = new Data (d,m,a);
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getCpf() 
	{
		return cpf;
	}

	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}

	public Data getDtNasc() 
	{
		return dtNasc;
	}

	public void setDtNasc(Data dtNasc) 
	{
		this.dtNasc = dtNasc;
	}

	
	public String toString() 
	{
		return  "O nome da pessoa é : " + nome + 
	             " CPF da pessoa é :" + cpf + 
	             " A data de nascimento da pessoa  é :" + dtNasc;
	}
	
	
	
	
	
	
	
	
	
	

}
