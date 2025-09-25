package orientacaoPriscila;

public class Lista2Exer1 {
	
	private double raio = 1;
	private String cor = "vermelho";
	private static double PI = 3.14598;

	
	
	public Lista2Exer1(double raio, String cor)
	{
		
		this.raio = raio;
		this.cor = cor;
	}
	public double getRaio()
	{
		return raio;
	}
	public void setRaio(double raio) 
	{
		this.raio = raio;
	}
	public String getCor() 
	{
		return cor;
	}
	public void setCor(String cor)
	{
		this.cor = cor;
	}
	public double CalcularArea()
	{
		return (2*PI*(raio*raio));
	}
	public void MostrarDados()
	{
		System.out.println("\n --- Dados do Círculo ---");
		System.out.println("Cor: " + getCor());
		System.out.printf("Raio: %.2f\n", getRaio());
		System.out.printf("Área: %.2f\n", CalcularArea());
	}}