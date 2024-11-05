package Entities;

public class Produto {
	
	private String name;
	protected Integer quantidade;
	private Double valorUnidade;
	
	public Produto() {
		
	}
	
	public Produto(Integer quantidade) {
		
	}
	
	public Produto(String name, Integer quantidade, Double valorUnidade) {
		super();
		this.name = name;
		this.quantidade = quantidade;
		this.valorUnidade = valorUnidade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public Double getValorUnidade() {
		return valorUnidade;
	}

	public void setValorUnidade(Double valorUnidade) {
		this.valorUnidade = valorUnidade;
	}
	
	public double valorTotal() {
		return quantidade * valorUnidade;
	}
	public void removeProduto(int quantity) {
		this.quantidade -= quantity;
	}
	public void addProduto(int quantity) {
		this.quantidade += quantity;
	}
	

	public String toString() {
		return name + ", " + quantidade + " unidades , R$ " + String.format("%.2f", valorTotal());
	}
	
}
