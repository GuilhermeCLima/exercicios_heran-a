package POO2;

public class Vendedor extends Pessoa {
	private double valorVendas;
	private double comissao;
	private double totalVendas;
	
	public Vendedor(String nome,String endereco,String telefone,double valorVendas, double comissao) {
		super(nome,endereco,telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	public double Vendas() {
		totalVendas = (valorVendas * comissao) + valorVendas;
		return totalVendas;
	}
	public void mostraVendedor() {
		System.out.println("Seu nome �: " + getNome());
		System.out.println("Seu endere�o �: " + getEndereco());
		System.out.println("Seu telefone �: " + getTelefone());
		System.out.println("suas vendas foram: " + getValorVendas());
		System.out.println("sua comiss�o foi de: " + getComissao() + "%");
		System.out.println("O seu ganho junto a comiss�o � de: " + Vendas());
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public double getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
}
