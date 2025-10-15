package priscillaHeranca;

public class Funcionario extends Pessoa // funcionario vai ter dat de admissão e salario 
	{
		private Data dtAdmissao;
		private double salario;
		
		public Funcionario() 
		{ } 
		
		// construtor com o nome,cpf e a data de nascimento  da classe pessoa + salario e a data de Adm do funcionario. 
		public Funcionario(String nome, String cpf, Data dtNasc,Data dtAdm,double salario)  
		{
			super(nome,cpf,dtNasc);
			this.dtAdmissao = dtAdm;
			this.salario = salario;
		}
		// nesse construtor a data passei por d m a 
		public Funcionario(double salario,String nome, String cpf, Data dtNasc,Data dtAdm, 
				                    int d, int m, int a, int dfuncionarioAdm, int mfuncionarioAdm, int afuncionarioAdm) 
		{
			super(nome,cpf,d,m,a);
			this.dtAdmissao = dtAdm;
			this.salario = salario;
		}
		public Funcionario(Pessoa p,Data dtA,double salario) 
		{
			super(p.getNome(),p.getCpf(),p.getDtNasc());
			this.dtAdmissao= dtA;
			this.salario = salario;
		}
		
		public Data getDtAdmissao() 
		{
			return dtAdmissao;
		}

		public void setDtAdm(Data dtAdm) 
		{
			this.dtAdmissao = dtAdm;
		}

		public double getSalario() 
		{
			return salario;
		}

		public void setSalario(double salario) 
		{
			this.salario = salario;
		}
		public String toString () 
		{
			return (super.toString()+ " Data de Admição: " + dtAdmissao + " Salario do funcionario: " + salario);
		}}
		// super.toString() - vai herdar os dados de pessoa lá da classe pessoa. A classe super classe.


