package exercicioUm;

public class Produto implements Comparable<Produto> {
   
	private String nome;
	private Double preco;
	private Double desconto;
	
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	@Override
	public int compareTo(Produto o) {
		return preco.compareTo(o.getPreco());
	}
	
	
	
	
	
}
