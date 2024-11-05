package Entities;

import entities_Enum.Type;

public class Lanche extends Produto{

	private String NCM;
	private Type tipo;
	
	public Lanche() {
		
	}
	
	public Lanche(String name, Integer quantidade, Double valorUnidade, String nCM, Type tipo) {
		super(name, quantidade, valorUnidade);
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
