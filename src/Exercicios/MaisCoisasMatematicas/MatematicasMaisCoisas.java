package Exercicios.MaisCoisasMatematicas;

import static java.lang.Math.PI;
import static java.lang.Math.max;

public class MatematicasMaisCoisas {

	public static void main(String[] args) {

		// Arredondamento ceil, floor e round
		double n = 5.4;
		System.out.println("Menor inteiro: " + Math.floor(n));
		System.out.println("Maior inteiro: " + Math.ceil(n));
		System.out.println("Arredondando: " + Math.round(n));


		// Potencia
		System.out.println("2^3: " + Math.pow(2, 3));

		// Raiz quadrada
		System.out.println("Raiz de 9: " + Math.sqrt(9));

		// Trigonometria
		System.out.println("Seno: " + Math.sin(40));

		// N�meros randomicos
		double numeroAleatorio = Math.random() * 100;
		System.out.println(numeroAleatorio);

		// Comprimento de uma circunferencia 2 x r x PI (3,1415)
		int raio = 4;
		double comprimento = 2 * raio * PI;
		System.out.println("Comprimento: " + comprimento);


		// Maximo e minimo
		double[] precosProdutoA = {30.20, 25.49};
		double maiorPreco = max(precosProdutoA[0], precosProdutoA[1]);
		System.out.println("Maior pre�o: " + maiorPreco);
		System.out.println("Menor pre�o: " + Math.min(precosProdutoA[0], precosProdutoA[1]));

	}
}
