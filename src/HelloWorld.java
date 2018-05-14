public class HelloWorld {

    // Variavel String ********

    public String nome;
    public char umaLetrinha;

    // Variavel Inteiros ********

    private int meusNumeros;     // Int: 4 bytes.
    public  byte apenasumByte;  //  Byte: 1 byte.
    public  short numeroCurto; //   Short: 2 bytes.
    public  long numerlongo;  //    Long: 8 bytes.

    // Variavel Floats ********

    private float numeroQuebrado; // Float: 4 bytes.
    private double numeroSoma;   //  Double: 8 bytes

    // Variavel Boolean ********

    Boolean duvida;

    // Variavel Constantes ********
    final float PI = 3.1416F;
    final String NOME_DO_PROFESSOR = "Victor";

    public static void main(String[] args) {
        // ele vai ˜printar˜ Hello, World na janela do terminal
        System.out.println("Hello, World");

    }
}