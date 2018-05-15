package Exercicios.HelloWorld;

public class HelloWorld {
	
	public static void main(String[] args) {
	    System.out.println("Hello World");
	}
}

/*

public
É o modificador de acesso do método. Usando este modificador o método pode ser acessado por qualquer classe dentro (e fora) do projeto.

		Outros modificadores são protected, private ou sem modificador*. Aqui pode-se ler mais sobre os modificadores de acesso do Java.

static
Define o método como estático, isso quer dizer que a classe não precisa ser instanciada para chamar este método.

		No exemplo, tenho a classe Cliente com os métodos (estático) FazerAlgo() e (não-estático) FazerAlgoDois(), o uso seria assim:

		Cliente cliente = new Cliente();
		cliente.FazerAlgoDois(); // Este é o método não-estático

		Cliente.FazerAlgo(); // Este é o método estático
		void
		É tipo de retorno do método. Este tipo de retorno significa vazio/nada, o método não dá retorno nenhum. Os métodos podem retornar qualquer tipo do seu projeto, até mesmo os criados por você.

		main
		É o nome do método. Todo e qualquer método precisa ter um nome. Os nomes são definidos pelo programador e geralmente seguem algum padrão convencional definido previamente pela linguagem ou pela comunidade, embora isso seja opcional. No caso do Java, a própria Oracle define estas convenções. A convenção referente a nomeação de métodos diz:

		Methods should be verbs, in mixed case with the first letter lowercase, with the first letter of each internal word capitalized.

		Em tradução livre:

		Métodos devem ser verbos, em "mixed case" com a primeira letra minúscula e a primeira letra das palavras internas em letra maiúscula.

		No Java (e em outras linguagens também) o main é o ponto de entrada da aplicação. É o método que a JRE procura para executar a aplicação. Por isso, em alguns tipos de aplicação (como Swing ou console) é obrigatório tê-lo implementado. É possível ver mais detalhes sobre isso em Por que é obrigatório implementar "public static void main (String [] args)"?

		(String[] args)
		Define que o método deve receber como parâmetro um array de String (nomeado args). Nesse caso específico: este parâmetro serve para caso seu programa precise receber algum valor como argumento, isso é muito comum quando o programa é iniciado por outro programa ou pelo terminal (CMD, Shell, Bash, etc.).

		Um exemplo muito comum é o Git. Quando você digita git commit no seu terminal está chamando o Git com o parâmetro commit. Todas as "strings" que vierem depois do nome do programa serão recebidas pelo mesmo dentro do array (args). Geralmente a primeira posição do array é o caminho que a aplicação se encontra.

		*Membros sem modificadores de acesso são considerados package-private. Eles só estarão disponíveis dentro do package que estiverem declarados.*/
