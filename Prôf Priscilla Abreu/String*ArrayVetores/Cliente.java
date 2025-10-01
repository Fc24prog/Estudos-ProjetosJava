package priscilaArrays;

public class Cliente {
	
	private int codigo_cliente;
	private String nome_cliente;
	private String cpf_cliente;
	private String telefone;
	
	 public Cliente() 
	 {
	
	 }
	 
	 public Cliente(int codigo_cliente, String nome_cliente, String cpf_cliente, String telefone) 
	 {
		
		this.codigo_cliente = codigo_cliente;
		this.nome_cliente = nome_cliente;
		this.cpf_cliente = cpf_cliente;
		this.telefone = telefone;
	}

	public int getCodigo_cliente() 
	{
		return codigo_cliente;
	}

	 public void setCodigo_cliente(int codigo_cliente)
	 {
		 this.codigo_cliente = codigo_cliente;
	 }

	 public String getNome_cliente() 
	 {
		 return nome_cliente;
	 }

	 public void setNome_cliente(String nome_cliente) 
	 {
		 this.nome_cliente = nome_cliente;
	 }

	 public String getCpf_cliente()
	 {
		 return cpf_cliente;
	 }

	 public void setCpf_cliente(String cpf_cliente) 
	 {
		 this.cpf_cliente = cpf_cliente;
	 }

	 public String getTelefone() 
	 {
		 return telefone;
	 }

	 public void setTelefone(String telefone)
	 {
		 this.telefone = telefone;
	 }

	 public String toString()
	 {
		 return "O codigo do cliente é: " + codigo_cliente + "nome do cliente é: " + nome_cliente + 
				 "CPF do cliente é: " + cpf_cliente + "Telefone do cliente é: " + telefone; 
    
	 
	 }}
