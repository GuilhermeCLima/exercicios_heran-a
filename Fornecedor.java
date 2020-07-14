package POO2;

public class Fornecedor extends Pessoa  {
	private float valorCredito;
	private float valorDivida;
	private float total;
	
	public Fornecedor(String nome,String endereco,String telefone,float valorCredito,float valorDivida) {
		
		super(nome,endereco,telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	public void total(float total) {
		
		this.total = total;
	}

	public float getTotal() {
		return total;
	}
	public void setTeste(float total) {
		this.total = total;
	}
	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	public float obterSaldo() {
		
		total = valorCredito - valorDivida;
		return total;
	}
	public void mostraJorge() {
		System.out.println("Seu nome é: " + getNome());
		System.out.println("Seu enredeço é: " + getEndereco());
		System.out.println("Seu telefone é: " + getTelefone());
		System.out.println("Seu valor de credito é: " + getValorCredito());
		System.out.println("Sua divida é: " + getValorDivida());
		System.out.println("O credito menos a divida é:" + obterSaldo());
	}
}
