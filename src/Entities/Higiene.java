package Entities;

import entities_Enum.Type;

public class Higiene extends Produto{
	
	private String NCM;
	private Type tipo;
	
	public Higiene() {
		
	}

	public Higiene(String name, Integer quantidade, Double valorUnidade, String nCM, Type tipo) {
		super(name, quantidade, valorUnidade);
		NCM = nCM;
		this.tipo = tipo;
	}

	public Higiene(String nCM, Type tipo) {
		super();
		NCM = nCM;
		this.tipo = tipo;
	}

	public String getNCM() {
		return NCM;
	}

	public void setNCM(String nCM) {
		NCM = nCM;
	}

	public Type getTipo() {
		return tipo;
	}

	public void setTipo(Type tipo) {
		this.tipo = tipo;
	}
	
}
