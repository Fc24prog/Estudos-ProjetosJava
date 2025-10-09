package estudoSobreHerança;

public class PrincipalFuncPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa p1,p2;
		Funcionario f1,f2,f3;
		
		System.out.println("Dados da pessoa: ");
		
		p1= new Pessoa("Cássia Santana","185.689.978-70",new Data (31,01,1956));
		p2= new Pessoa("Bruna Carvalho","145.689.417-00",new Data (14,8,2005));
		
		System.out.println("-------------------------------------- ");
		
		System.out.println("Dados do funcionario: ");
		
		//f1= new Funcionario("Luana Gomes","145.781.599-88",new Data (31,1,1956),new Data(15,12,2006), 20000);
		f2= new Funcionario(p1, new Data(20,8,2015),1200);
		f3= new Funcionario(p2, new Data(13,10,2003),120000);
		
		System.out.println("Apresentação dos dados: ");

		System.out.println(p1);
		System.out.println(p2);
		//System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
	}

}
