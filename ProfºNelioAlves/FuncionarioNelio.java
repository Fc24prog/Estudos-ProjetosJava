package orientacaoNelio;

public class FuncionarioNelio {
	
	public String nome;
	public double salario_bruto = 0.0;
	public double imposto;
	
	
	public double salarioLig()
	{
		return salario_bruto - imposto;
	}
	public double incrementacaoSalario(double porcentagem)
	{
		return salario_bruto += (salario_bruto * porcentagem/100.0);
		
	}

	public String toString() 
	{
		return ("O nome do funcionario é: " + nome + " O seu salario bruto sem desconto é: " + salario_bruto + 
				"O salario com o imposto é: " + String.format("%.2f", salarioLig())); 
		// quando eu apresentar o salario final, já vai estar calculado com a porcentagem		
// quando o salrio liquido for fazer a conta dele, primeiro ele vai ve o negocio da porcentagem, por isso pode fazer em cima do salario bruto
	}
	}
