package Exercicios.ExemplosdeStringStringBufferStringBuilder;

public class TesteStrings {

	public static void main(String[] args) {
		// String, StringBuilder e StringBuffer
		
		String s = "Ol�"; // Criada a String "Ol�"
		s = s + " Pessoal!";  // Criada a String "Ol� Pessoal!"
				
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("Ol�"); // Existe a StringBuilder
		sb.append(" Pessoal!"); // Reaproveitando a StringBuilder
		
		String resultado = sb.toString();
		System.out.println("Com StringBuilder: " + resultado);
	}
	
}
