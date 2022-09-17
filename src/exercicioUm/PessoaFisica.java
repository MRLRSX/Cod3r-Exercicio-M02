package exercicioUm;

public class PessoaFisica {
  
	private String CPF;
	private String nome;
	private Integer idade;
	
	public PessoaFisica(String cPF, String nome, Integer idade) {
		CPF = cPF;
		this.nome = nome;
		this.idade = idade;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
}
