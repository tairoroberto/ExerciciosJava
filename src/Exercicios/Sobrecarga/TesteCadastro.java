package Exercicios.Sobrecarga;

public class TesteCadastro {

	public static void main(String[] args) {
		CadastroPessoa cadastro = new CadastroPessoa();
		
		Pessoa pessoa = new Pessoa("Jos�", 32);
		cadastro.cadastrar(pessoa);
		
		// -------------------------------------
		
		cadastro.cadastrar("Maria", 25);
	}
	
}
