package orientacaoNelio;

public class Retangulo {
	
	public double altura;
	public double base;
	
	public double area()
	{
		return altura*base;
		
	}

	public double perimetro()
	{
		return 2*(altura+base);
		
	}
	public double diagonal()
	{
		return Math.sqrt(base*base + altura*altura);
		
		
	}public String toString()
	{
		return 	("a altura : " + String.format("%.2f" ,altura) + " O valor  da base é:" + String.format("%.2f" ,base) + 
				" O valor da área é: " +String.format("%.2f" ,area()) + " O valor do perimetro é: " + String.format("%.2f" ,perimetro())+
				" O valor da diagonal é: " + String.format("%.2f" ,diagonal()));
	}}



