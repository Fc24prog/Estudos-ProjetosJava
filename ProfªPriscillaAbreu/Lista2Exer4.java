package orientacaoPriscila;

public class Lista2Exer4 {
	
	private String nome;
	private String matricula;
	private double nota1;
	private double nota2;
	
	public Lista2Exer4(String nome, String matricula, double nota1, double nota2) 
	{
		
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
   public String getNome() 
   {
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
    public String getMatricula() 
    {
		return matricula;
	}

	public void setMatricula(String matricula)
	{
		this.matricula = matricula;
	}

	public double getNota1() 
	{
		return nota1;
	}

	public void setNota1(double nota1) 
	{
		this.nota1 = nota1;
	}
	
	public double getNota2() 
	{
		return nota2;
	}

	public void setNota2(double nota2)
	{
		this.nota2 = nota2;
	}

	public double calcularMedia() 
	{
		return (this.nota1 + this.nota2) / 2;
	}
	
	public String verificarSituacao()
	{
	    double media = this.calcularMedia(); // Chama o método anterior
	    
	    if (media >= 6.0) 
	    {
	        return "Aprovado";
	    } 
	    else
	    {
	        return "Reprovado";
	    }
	}
	public void exibirDados() 
	{
		
		 System.out.println("--------------------------------");
		 System.out.println("Nome: " + this.nome);
		 System.out.println("Matricula: " + this.matricula);
		 System.out.println("1ª nota:: " + this.nota1);
		 System.out.println("2ª nota:: " + this.nota2);
		 System.out.println("Situação do aluno: " + verificarSituacao());

		 System.out.println("--------------------------");
		
	}}
	
	
	
