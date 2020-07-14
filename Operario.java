package POO2;

public class Operario extends Pessoa  {
	private float valorProducao;
	private double comissao;
	private double salarioOperario;
	
	public Operario(String nome,String endereco,String telefone,float valorProducao,double comissao) {
		super(nome,endereco,telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	public double salarioOperario() {
		salarioOperario = (valorProducao * comissao) + valorProducao;
		return salarioOperario;	
	}
	public void mostraOperario() {
		System.out.println("Seu nome é: " + getNome());
		System.out.println("Seu endereço é: " + getEndereco());
		System.out.println("Seu telefone é: " + getTelefone());
		System.out.println("Seu salario mais a sua comissão fica em: " + salarioOperario());
	};
	public float getValorProducao() {
		return valorProducao;
	}
	public double getSalarioOperario() {
		return salarioOperario;
	}
	public void setSalarioOperario(double salarioOperario) {
		this.salarioOperario = salarioOperario;
	}
	public void setValorProducao(float valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
