package Exercicios.ClassesAbstratas;

public class ProdutoPerecivel extends Produto {

	String dataValidade; //Por enquanto, at� aprendermos a classe Date
	
	public void imprimirDescricao() {
		//Digitar a l�gica...
		System.out.println("Descri��o: " + super.getDescricao() + ". Vencendo em: " + dataValidade);
	}

}
