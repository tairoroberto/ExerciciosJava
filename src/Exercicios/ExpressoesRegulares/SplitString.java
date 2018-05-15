package Exercicios.ExpressoesRegulares;

public class SplitString {

	public static void main(String[] args) {
		String texto = "O42Java11é33uma9linguagem9HARRYpooterdsdhskh.";
		
		String[] palavras = texto.split("\\d+");
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
	}
	
}
