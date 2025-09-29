package orientacaoPriscila;

public class Lista2Exer3 {
	
	private int lado1; 
	private int lado2;
	private int lado3;
	
	public Lista2Exer3(int lado1, int lado2, int lado3)
	{
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
   public int getLado1() 
   {
		return lado1;
	}
	public void setLado1(int lado1)
{
		this.lado1 = lado1;
	}
	public int getLado2()
	{
		return lado2;
	}
	public void setLado2(int lado2)
	{
		this.lado2 = lado2;
	}
	public int getLado3() 
	{
		return lado3;
	}
	public void setLado3(int lado3) 
	{
		this.lado3 = lado3;
	}

	public String informarTipo()
	{
		if (lado1 == lado2 && lado2 == lado3)  // 3 lados iguais
		{
           return "equilatero";
		}
		if (lado1 == lado2 || lado2 == lado3 || lado1==lado3) // 2 lados iguais
		{
		    return "Isósceles";
		}
		else
		{
		     return "Escaleno";	
		}
	}
	public void exibirDados() 
	{
		System.out.println("--- Dados do Triângulo ---");
		System.out.println("Lado 1 (l1): " + this.lado1);
		System.out.println("Lado 2 (l2): " + this.lado2);
		System.out.println("Lado 3 (l3): " + this.lado3);
		System.out.println("Tipo: " + informarTipo());
		System.out.println("--------------------------");
		
	}}
