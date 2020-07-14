package POO2;

public class Empregado extends Pessoa {
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	private float salario;

	
	public Empregado(String nome,String endereco,String telefone,int codigoSetor,int salarioBase, int imposto) {
		
		super(nome,endereco,telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	public void salario(float salario) {
		
		this.salario = salario;}
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getImposto() {
		return imposto;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	public float calcSal() {
		
		salario = salarioBase - imposto;
		return salario;
	}
	public void mostraGu() {
		System.out.println("Seu nome é:" + getNome());
		System.out.println("Seu endereco é:" + getEndereco());
		System.out.println("Seu numero é:" + getTelefone());
		System.out.println("Seu codigo é :" + getCodigoSetor());
		System.out.println("Seu salario base é :" + getSalarioBase());
		System.out.println("A quantidade de imposto no seu salario é :" + getImposto());
		System.out.println("Seu salario com desconto é :" + calcSal());
		
		
	}
	
	
	
}
