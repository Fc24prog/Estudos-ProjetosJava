package estudoSobreHerança;

public class Funcionario extends Pessoa
{
	private Data dtAdm;
	private double salario;
	
	public Funcionario() 
	{ } 
	
	public Funcionario(double salario,String nome, String cpf, Data dtNasc,Data dt) 
	{
		super(nome,cpf,dtNasc);
		this.dtAdm = dt;
		this.salario = salario;
	}
	
	public Funcionario(double salario,String nome, String cpf, Data dtNasc,Data dt, 
			                    int d, int m, int a, int dfuncionarioAdmi, int mfuncionarioAdmi, int afuncionarioAdmi) 
	{
		super(nome,cpf,d,m,a);
		this.dtAdm = dt;
		this.salario = salario;
	}
	public Funcionario(Pessoa p,Data dtA,double salario) 
	{
		super(p.getNome(),p.getCpf(),p.getDtNasc());
		this.dtAdm = dtA;
		this.salario = salario;
	}
	
	public Data getDtAdm() 
	{
		return dtAdm;
	}

	public void setDtAdm(Data dtAdm) 
	{
		this.dtAdm = dtAdm;
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
		return (super.toString()+ "Data de Admição: " + dtAdm + "Salario do funcionario: " + salario);
	}}
	// super.toString() - vai herdar os dados de pessoa lá da classe pessoa. A classe super classe.
