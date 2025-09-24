package trabalhoCassiaSantanaFranco;

public class Retangulo {
	
	private double largura =1.0;
	private double altura =1.0;
	
	public Retangulo() 
	{
		this.largura = largura;
		this.altura = altura;
	}

	public double getLargura() 
	{
		return largura;
	}

	public void setLargura(double largura) 
	{
		this.largura = largura;
	}

	public double getAltura() 
	{
		return altura;
	}

	public void setAltura(double altura) 
	{
		this.altura = altura;
	}
	public double calcularArea()
	{
		return altura*largura;
		
	}

	public double calcularPerimetro()
	{
		return (2*(altura+largura));
		
	}
	public String toString()
	{
		return 	("a altura: " + String.format("%.2f" ,altura) + " Largura é: " +  String.format("%.2f" ,largura) +
				"\n" + "O valor da área é: " +String.format("%.2f" ,calcularArea()) + "\n" +
				                  "O valor do perimetro é: " + String.format("%.2f" ,calcularPerimetro()));	
	}}
