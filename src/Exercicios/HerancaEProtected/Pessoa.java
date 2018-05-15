package Exercicios.HerancaEProtected;

public class Pessoa {

	String nome;
	protected int idade;
	
	public void seApresentar() {
		System.out.println("Ol�, eu sou o " + nome + ", e tenho " + idade + " anos.");
	}
	
}
