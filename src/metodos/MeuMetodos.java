package metodos;

import java.util.Scanner;

class MeuMetodos {

    int somar(int n1, int n2){
        int soma;

        soma = n1+n2;
        System.out.println("Sua Conta deu: " + soma);
       return soma;
    }

    public static void main(String[] args) {
        // ele vai ˜printar˜ Hello, World na janela do terminal
        System.out.println("Hello, World");

        // ***** calma padawan!
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        System.out.print("O valor informado foi " + numero);
    }
}
