package sistemaBancario;

public class Conta {
	
	private int numero_conta;
	private String nome_proprietário;
	private int tipo_conta; // 1 para corrente e 2 para poupança
	private double saldo;
	private double limite; // representa o valor máximo adicional que o cliente pode utilizar além do seu saldo atual.
	
	public Conta(int numero_conta, String nome_proprietário, int tipo_conta, double saldo, double limite)
	{
		this.numero_conta = numero_conta;
		this.nome_proprietário = nome_proprietário;
		if (tipo_conta == 1 || tipo_conta == 2)
		
			this.tipo_conta = tipo_conta;
		
		else 
			System.out.printf ("Por favor verificar o número inserido: ");
				
		this.saldo = saldo;
		this.limite = limite;
	}

	public int getNumero_conta() 
	{
		return numero_conta;
	}


	public void setNumero_conta(int numero_conta) 
	{
		this.numero_conta = numero_conta;
	}


	public String getNome_proprietário() 
	{
		return nome_proprietário;
	}


	public void setNome_proprietário(String nome_proprietário) 
	{
		this.nome_proprietário = nome_proprietário;
	}

	public int getTipo_conta()
	{
		return tipo_conta;
	}

	public void setTipo_conta(int tipo_conta)
	{
		  if (tipo_conta == 1 || tipo_conta == 2)
		    {
		        this.tipo_conta = tipo_conta;
		    } 
		  else
		    {
		        // Informa que a alteração não foi realizada
		        System.out.println("ERRO: O tipo de conta deve ser 1 (Corrente) ou 2 (Poupança).");
		    }}
	public double getSaldo() 
	{
		return saldo;
	}

	public void setSaldo(double saldo) 
	{
		this.saldo = saldo;
	}


	public double getLimite()
	{
		return limite;
	}

	public void setLimite(double limite) 
	{
		this.limite = limite;
	}

	public double Sacar(double valorSolicitado) 
	{
	    // 1. O valor solicitado deve ser positivo
	    if (valorSolicitado <= 0) {
	        System.out.println("Erro: O valor do saque deve ser positivo.");
	        return this.saldo; // Retorna o saldo inalterado
	    }

	    // 2. Verifica se o saldo atual é suficiente
	    if (this.saldo >= valorSolicitado) 
	    {                                  
	        this.saldo -= valorSolicitado;  // Se for suficiente, subtrai o valor do saldo
	        System.out.println("Parabéns: Saque realizado com sucesso.");
	        return this.saldo; // Retorna o novo saldo
	    } 
	    else // Se não houver saldo suficiente

	    {
	        System.out.println("Erro: Saldo insuficiente para realizar o saque.");
	        return this.saldo; // Retorna o saldo inalterado
	    }
	}
	
	public double Depositar(double valorDepositado) 
	{
	    // 1. O valor solicitado deve ser positivo
	    if (valorDepositado >= 0) 
	    {                                  
	        this.saldo += valorDepositado;  // adiciono o novo valor
	        return this.saldo; // Retorna o novo saldo
	    } 
	    else 

	    {
	    	System.out.println("Erro: O valor do deposito  deve ser positivo.");
	        return this.saldo; // Retorna o saldo inalterado
	   }}
	
	public void consultarSaldo()
	{
        System.out.println("Conta nº " + numero_conta + " | Dono: " + nome_proprietário + 
                           " | Saldo atual: R$ " + saldo);
    }
	public boolean Transferir(Conta contaDestino, double valorTransferencia) // contaDestino é do tipo Conta;
	{
	    // 1. Verifica se o valor é positivo
	    if (valorTransferencia <= 0)
      {
	        System.out.println("Erro na Transferência: O valor deve ser positivo.");
	        return false; // Transferência falhou
      }
	    if (this.saldo >= valorTransferencia) 
	    {
	        this.saldo -= valorTransferencia;    // Realiza o saque na conta de origem
            contaDestino.Depositar(valorTransferencia);
	        return true; // Transferência bem-sucedida

	    }
	    else 
	    {
	        // Saldo insuficiente
	        System.out.println("Erro na Transferência: Saldo insuficiente na Conta " + this.numero_conta + ".");
	        return false; // Transferência falhou
	    }}}   
	   
	  
