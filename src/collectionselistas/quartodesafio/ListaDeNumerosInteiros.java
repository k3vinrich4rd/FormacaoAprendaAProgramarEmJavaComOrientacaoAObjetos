package collectionselistas.quartodesafio;

/*Crie uma lista de números inteiros e utilize o método Collections.sort
para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.*/



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaDeNumerosInteiros {
    public static void main(String[] args) {

        List<Integer> numerosInteiros = new ArrayList<>();
        numerosInteiros.add(10);
        numerosInteiros.add(4);
        numerosInteiros.add(3);
        numerosInteiros.add(2);
        numerosInteiros.add(24);
        numerosInteiros.add(5);
        numerosInteiros.add(1);

        Collections.sort(numerosInteiros);
        System.out.println("Lista ordenada: " + numerosInteiros);
    }
}
