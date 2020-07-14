package POO2;

public class Pessoa implements Tabela {
	private String nome;
	private String endereco;
	private String telefone;
	private String salva;
	
	public Pessoa(String nome,String endereco,String telefone) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}
	public String getSalva() {
		return salva;
	}

	public void setSalva(String salva) {
		this.salva = salva;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String mostraNome() {
		
		System.out.println("Seu nome é: " + nome);
		return endereco;
	
	}
	public String mostraPa() {
		System.out.println("Seu endereço é: " + endereco);
		System.out.println("Seu telefone é: " + telefone);
		return salva;
	}
	
}
