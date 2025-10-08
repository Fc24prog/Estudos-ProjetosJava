package composicaoNelio;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
	
	private String nome;
	private NivelTrabalho nivel;
	private double base_salario; 
	
	private Departamento departamento;
	private List<Contrato_Hora> contratos = new ArrayList <>(); // como o trabalhador têm varios contratos, vou represetntar por uma lista
	// o trabalhador tem uma lista de contratos, e depois eu vou adicionar/ remover contratos dessa lista. Mas não posso tocar nessa lista 
	//por outra lista, por isso não posso ter o metodos set da lista 
	
	public Trabalhador()
	{ }

      // quando eu uso uma composição - tem muitos, eu não incluo no construtor;
	public Trabalhador(String nome, NivelTrabalho nivel, double base_salario, Departamento departamento) 
	{
		
		this.nome = nome;
		this.nivel = nivel;
		this.base_salario = base_salario;
		this.departamento = departamento;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
{
		this.nome = nome;
	}

	public NivelTrabalho getNivel()
	{
		return nivel;
	}

	public void setNivel(NivelTrabalho nivel)
	{
		this.nivel = nivel;
	}

	public double getBase_salario() 
	{
		return base_salario;
	}

	public void setBase_salario(double base_salario)
	{
		this.base_salario = base_salario;
	}

	public Departamento getDepartamento() 
	{
		return departamento;
	}

	public void setDepartamento(Departamento departamento)
	{
		this.departamento = departamento;
	}

	public List<Contrato_Hora> getContratos() 
	{
		return contratos;
	}

	public void adicionarContrato(Contrato_Hora contratoAdicionado)
	{
		this.contratos.add ( contratoAdicionado);
	}
	
	public void removedorContrato(Contrato_Hora contratoRemovido)
	{
		this.contratos.remove ( contratoRemovido);
	}
	
	//O this.contratos refere-se à lista de contratos que é um atributo (campo) do objeto Trabalhador.
	//É a forma mais clara de dizer "Adicione o contrato passado por parâmetro à minha lista de contratos."
	
	public double rendaTrabalhador(double mes, double ano)  // O trabalhador tem o salarioBase, quanto ele ganhou no mes é o 
	                                                // salarioBase + quanto ganhou nos contratos daquele mes
	{
		double soma = this.base_salario; // uma variavel soma para receber o salario base; 
		Calendar cal = Calendar.getInstance(); // importando o calendario do java.
				
		for (Contrato_Hora c: this.contratos) // Aqui to testanto se cada contrato for desse mês e desse ano vou acrescentar 
			                                   //na  variavel soma, o contrato desse mes e ano. A variavel soma já está
			                                    // recebendo o salarioBase
		{
			cal.setTime(c.getData()); //to importanto a data do meu contrato com o get e defini como sendo a data do meu calendario com o set
			int c_ano= cal.get(Calendar.YEAR); //Tem que ser YEAR mesmo, pq to importando a biblioteca do calendario mesmo e associa ao ano 
			                                  //atual | c_ano  para receber o ano do contrato que estou analizando 
			                                   //| cal é minha variavel que associo a calendar
		    int c_mes= 1 + cal.get(Calendar.MONTH); // precisa ter + 1 pq é necessario pq o mes começa com 0; 
			
		    if (ano == c_ano && mes == c_mes) // se o ano passado por parametro for igual ao ano desse contrato, aí o valor do 
		    	                              //contrato vai entrar na soma
		    {
		    	 soma += c.TotalValor();   // totalValor ta na classe contato por hora 
		    }}
		return soma;
		}

}
