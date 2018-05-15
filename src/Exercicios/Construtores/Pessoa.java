package Exercicios.Construtores;

public class Pessoa {

	String nome;
	int idade;
	
	Pessoa(String nome) {
		this.nome = nome;
		// Inicializa��o bem complicada de fazer...
	}
	
	Pessoa(String nome, int idade) {
		this(nome); // Deve ser a primeira instru��o dentro do construtor
		this.idade = idade;
	}
}
