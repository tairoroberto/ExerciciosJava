import javax.swing.*;
import java.util.ArrayList;

public class Principal {

    public boolean menorQueOSegundo(int primeiro, int segundo){

        return primeiro < segundo;
    }

    public void maiorDeTresNumeros(int primeiro, int segundo, int terceiro){
        if(primeiro > segundo && primeiro > terceiro){

            System.out.println(primeiro);

        }else if(segundo > primeiro && segundo > terceiro){
            System.out.println(segundo);

        }else{
            System.out.println(terceiro);
        }
    }

    public boolean cadeiasDeTextoDiferentes(String texto1, String texto2){

        return texto1 != texto2;
    }

    public boolean par(int numero){

        return numero %2 == 0;
    }

    public boolean imparMaiorQueDez(int numero){
        return numero % 2 > 0 && numero >10;
    }

    public boolean algumMaior(int numA, int numB, int numC, int numD){
        return numA > numC && numA > numD || numB > numC && numB > numD;
    }

    public double media(ArrayList<Integer> arr){
        int resultado = 0;
        for(int contador: arr){
            resultado =  resultado + contador;
        }
        return resultado/arr.size();
    }

    public void cemPrimeiros(){
        for(int i = 0; i<= 100; i++){
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public boolean contemLetraA(String cadeiaDeTexto){

        return cadeiaDeTexto.contains("a");
    }

    public boolean contemLetraA(Character umaLetra, String cadeiaDeTexto) {
        for (int i = 0; i < cadeiaDeTexto.length(); i++) {
            if (cadeiaDeTexto.charAt(i) == umaLetra) {
                return true;
            }
        }
        return false;
    }

    public int totalArray(ArrayList<Integer>lista){
        int resultado = 0;

        for(int contador: lista){
        resultado = resultado + contador;
        }
        return resultado;
    }

    public int totalParresArray(ArrayList<Integer>lista){
        int resultado = 0;
        for(int contador: lista){
            if(contador % 2 == 0){
               resultado = resultado + contador;
            }
        }
        return resultado;
    }

    public void apenasOsPares(ArrayList<Integer> lista) {

        ArrayList<Integer> resultado = new ArrayList();

        for (int contador = 0; contador<lista.size(); contador ++) {
            if (lista.get(contador) % 2 == 0) {
                resultado.add(lista.get(contador));
            }
        }

        for(int contador = 0; contador<resultado.size(); contador ++){

            System.out.println(resultado.get(contador));
        }

    }

    public ArrayList<Integer> listaDePrimeirosCemPositivos(){
        ArrayList<Integer> positivos = new ArrayList();
        for(int contador = 1; contador<=100; contador ++){
            positivos.add(contador);
        }
        return positivos;
    }

    public ArrayList<Integer> listaDeNumerosEntre(int minimo, int maximo){
        ArrayList <Integer> lista = new ArrayList();

        for(int contador = minimo; contador<maximo; contador ++){
            lista.add(contador);
        }
        return lista;
    }


    public ArrayList<Integer> eliminarPares(ArrayList<Integer> listaRecebida){
        ArrayList <Integer> listaPropria = new ArrayList();

        for(int contador = 0; contador<listaRecebida.size(); contador++){
            if(listaRecebida.get(contador) % 2 != 0) {
                listaPropria.add(listaRecebida.get(contador));
            }
        }
        return listaPropria;
    }

}
