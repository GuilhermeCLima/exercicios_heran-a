package POO2;

public class Administrador extends Pessoa {
	private int ajudaDeCustos;

	public Administrador(String nome,String endereco,String telefone,int ajudaDeCustos) {
		super(nome,endereco,telefone);
		this.ajudaDeCustos = ajudaDeCustos;
	}
	public int getAjudaDeCustos() {
		return ajudaDeCustos;
	}

	public void setAjudaDeCustos(int ajudaDeCustos) {
		this.ajudaDeCustos = ajudaDeCustos;
	}
	public void mostraMarcos() {
		System.out.println("Seu nome é: " + getNome());
		System.out.println("Seu endereço é: " + getEndereco());
		System.out.println("Seu telefone é: " + getTelefone());
		System.out.println(getNome() + "ajuda no cuesto em " + getAjudaDeCustos());
	}
	
	
}
