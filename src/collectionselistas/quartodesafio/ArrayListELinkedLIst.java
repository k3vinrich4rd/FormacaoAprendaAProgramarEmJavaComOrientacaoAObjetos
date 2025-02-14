package collectionselistas.quartodesafio;

/*Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList.
Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListELinkedLIst {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Kevin Richard");
        nomes.add("Djavan");
        nomes.add("Tim Maia");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println();

        List<Integer> numeros = new LinkedList<>();
        numeros.add(10);
        numeros.add(9);
        numeros.add(3);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }


    }
}
