package priscilaArrays;

public class Estudante {
	
	private String nome_estudante;
	private int idade_estudante;
	private int matricula_estudante;
	
	  public Estudante() 
	  {	}
	  
	  
    public Estudante(String nome_estudante, int idade_estudante, int matricula_estudante) 
    {
		this.nome_estudante = nome_estudante;
		this.idade_estudante = idade_estudante;
		this.matricula_estudante = matricula_estudante;
	}
    
   public String getNome_estudante() 
   {
	return nome_estudante;
   }

   public void setNome_estudante(String nome_estudante) 
{
	this.nome_estudante = nome_estudante;
}

   public int getIdade_estudante() 
{
	return idade_estudante;
}


  public void setIdade_estudante(int idade_estudante)
  {
	this.idade_estudante = idade_estudante;
}

   public int getMatricula_estudante() 
   {
	return matricula_estudante;
}


public void setMatricula_estudante(int matricula_estudante) 
{
	this.matricula_estudante = matricula_estudante;
}

public String toString()
{
	return "Estudante [nome_estudante= " + nome_estudante + ", idade_estudante= " + idade_estudante
			+ ", matricula_estudante= " + matricula_estudante + "]";
}}