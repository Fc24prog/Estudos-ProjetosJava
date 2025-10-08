package priscillaComposição;

public class Compromisso {
	
	private Data dt; // instancia da classe data;
	private Hora hora; // instancia da classe hora;
	private String descricao;
	
	// construtor completo - Este permite criar um compromisso com todos os detalhes, incluindo data e hora exatas.

	public Compromisso(int d, int m, int a, int h, int min, int seg, String des)
	{
		dt = new Data(d,m,a); // delega a inicialização aos outros construtores - significa que quem vai iniciar é sua respectivas
		hora = new Hora(h, min, seg); // classes, Data e hora;
		descricao = des;
	}
	
	// Construtor Simplificado (Data Apenas):- Este permite criar um compromisso sem a hora exata.O desenvolvedor pode presumir que a hora
	// é 00:00:00 ou que a hora não é relevante.


		public Compromisso(int d, int m, int a, String des) // 
	{
		dt = new Data(d, m, a);
		hora = new Hora(0,0,0);
		descricao = des;
	}
	public String toString()
	{
		return ("Compromissos: \n "+ descricao + " "  + dt + " " + hora);
		
    }
}

// Se você tivesse apenas o primeiro construtor, toda vez que quisesse criar um compromisso sem a hora, você seria forçado a passar zeros 
//(ex: new Compromisso(10, 11, 2025, 0, 0, 0, "Almoço")).O construtor simplificado torna o código mais limpo, mais legível e
// menos propenso a erros para esse cenário.