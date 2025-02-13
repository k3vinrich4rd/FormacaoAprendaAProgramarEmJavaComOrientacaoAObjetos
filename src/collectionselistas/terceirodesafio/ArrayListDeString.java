package collectionselistas.terceirodesafio;

/*Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.*/

import java.util.ArrayList;

public class ArrayListDeString {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Lebron James");
        nomes.add("Djonga");
        nomes.add("Mike Tyson");
        nomes.add("Nina Simone");
        nomes.add("Tems");

        for (String nome : nomes) {
            System.out.println(nome);
        }


    }
}
