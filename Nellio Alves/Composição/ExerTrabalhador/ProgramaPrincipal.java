package composicaoNelio;
import java.text.SimpleDateFormat; //É a ferramenta usada para formatar datas (converter um objeto Date em um texto legível, como "25/10/2025") 
import java.text.ParseException;  // para tratar o erro caso o texto que você está tentando converter não siga o formato que você definiu.
import java.util.Date;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) throws ParseException  {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o nome do departamento: ");
		String nome_departamento = sc.nextLine();
		
		System.out.print("Entre com o nome  do trabalhador: ");
		String nome_trabalhador = sc.nextLine();
		
		System.out.println("Entre com o seu nível: ");
		String nivel_trabalhador= sc.nextLine();
		
		System.out.println("Entre com a sua base salarial: ");
		double salarioBase_trabalhador= sc.nextDouble();
		
		sc.nextLine();
		
// como  NivelTrabalho.valueOf(nivel_trabalhador) é um enum eu preciso chamar o nome da classe.valueof(variavelLocal)
// departamento é outro objeto do tipo departamento (na classe Trabalhador), por isso uso assim. igual o nivel_trabalhador
		
		Trabalhador trabalho = new Trabalhador(nome_trabalhador, NivelTrabalho.valueOf(nivel_trabalhador),salarioBase_trabalhador,
				                                                                                      new Departamento(nome_departamento));
		
		
		SimpleDateFormat fsd = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Quantos contratos esse trabalhador possui?: ");
		int quanti_contratos= sc.nextInt();
		
		for (int i = 0 ; i <  quanti_contratos ; i++)
		{
			
			 System.out.println("Entre com o " + i + " contrato:");
			 
			 System.out.print("Entre com a data (dd/MM/yyyy): ");
			 Date contrato_data = fsd.parse(sc.next());

			 System.out.print("Entre com o valor por hora: ");
			 float valor_hora = sc.nextFloat();

			 System.out.print("Duração (horas): ");
			 Integer horas = sc.nextInt();
			  
		    sc.nextLine(); 

			 Contrato_Hora cont = new Contrato_Hora(contrato_data, valor_hora, horas);
			 trabalho.adicionarContrato(cont);
		}
		  System.out.print("Entre com o mes e o ano para calcular o salario (/MM/yyyy): ");
		  String Mes_Ano = (sc.nextLine());
		  
		  double mes = Integer.parseInt(Mes_Ano.substring(0, 2));
		  double ano = Integer.parseInt(Mes_Ano.substring(3));
		  
		  System.out.println("Nome: " + trabalho.getNome());
		  System.out.println("Departamento: " + trabalho.getDepartamento().getNome());

		  double renda  = trabalho.rendaTrabalhador(mes,ano);
          System.out.println("Valor recebido: " + Mes_Ano + ": " + String.format("%.2f", renda));
			
				sc.close();}}
