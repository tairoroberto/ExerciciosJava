package Exercicios.MetodosArgumentos;

public class Principal {

	public static void main(String[] args) {
		FolhaPagamento folha = new FolhaPagamento();
		double salario = folha.calcularSalario(160, 12, 32.5, 40.2);
		
		System.out.println("Sal�rio calculado: " + salario);
	}
	
}
