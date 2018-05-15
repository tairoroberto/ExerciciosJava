package Exercicios.TratandoLancandoExcecoes;

public class TesteExcecoes {

	public static void main(String[] args) {
//		int numero = 5 / 0; // Lan�a java.lang.ArithmeticException
/*		String s = null;
		String maiuscula = s.toUpperCase(); // lan�a java.lang.NullPointerException */
		
		ContaCorrente cc = new ContaCorrente(100);
		
		try {
			cc.depositar(-10);
			// V�rias linhas de c�digo...
		} catch(IllegalArgumentException e) {
			System.out.println("Voc� executou uma opera��o ilegal: " + e.getMessage());
		}
			
	}
	
}
