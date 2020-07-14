package POO2;

public class PessoaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa guilherme =  new Pessoa("Guilherme","Rua Gui" ,"(11)99999-9999");
		Fornecedor Jorge = new Fornecedor("Jorge","Rua Jorge","(55)99999-9999",50,20);
		Empregado Gustavo = new Empregado("Gustavo","Rua Gustavo","(21)99999-9999",18,1000,100);
		Administrador Marquinhos = new Administrador("Marquinhos","Rua Marcos","(24)99999-9999",500);
		Operario Joel = new Operario("Joel","Rua Joel","(56)99999-9999",1500,0.8);
		Vendedor Ronaldo = new Vendedor("Ronaldo","Rua Ronaldo","(12)94002-8922",1000.0,0.9);
		guilherme.mostraNome();
		guilherme.mostraPa();
		System.out.println("------------------------------");
		System.out.println("exercicio 2");
		Jorge.obterSaldo();
		Jorge.mostraJorge();
		System.out.println("---------------------------------------");
		System.out.println("exercicio 3");
		Gustavo.mostraGu();
		System.out.println("---------------------------------------");
		System.out.println("exercicio 4");
		Marquinhos.mostraMarcos();
		System.out.println("---------------------------------------");
		System.out.println("exercicio 5");
		Joel.mostraOperario();
		System.out.println("---------------------------------------");
		System.out.println("exercicio 6");
		Ronaldo.mostraVendedor();
	}

}
