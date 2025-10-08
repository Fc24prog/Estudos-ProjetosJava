package composicaoNelio;

import java.util.Date;

public class Contrato_Hora // é a responsavel por saber o valor total de um contrato
{
	
	private Date data;
	private float valor_hora;
	private Integer quantidade_hora;
	
	public Contrato_Hora()
	{	}

	public Contrato_Hora(Date data, float valor_hora, Integer quantidade_hora) 
	{
	    this.data = data;
		this.valor_hora = valor_hora;
		this.quantidade_hora = quantidade_hora;
	}

	public Date getData() 
	{
		return data;
	}

	public void setData(Date data) 
	{
		this.data = data;
	}

	public float getValor_hora()
	{
		return valor_hora;
	}

	public void setValor_hora(float valor_hora) 
	{
		this.valor_hora = valor_hora;
	}

	public int getQuantiade_hora() 
	{
		return quantidade_hora;
	}

	public void setQuantiade_hora(int quantiade_hora) 
	
	{
		this.quantidade_hora = quantiade_hora;
	}
	public double TotalValor()
	{
		return valor_hora *  quantidade_hora;
	}}