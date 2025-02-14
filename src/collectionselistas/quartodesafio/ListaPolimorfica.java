package collectionselistas.quartodesafio;

/*Modifique o Exercício para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo.*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaPolimorfica {

    public static void main(String[] args) {

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Casa");
        listaPolimorfica.add("Carro");
        listaPolimorfica.add("Dinheiro");

        for (String itens : listaPolimorfica) {
            System.out.println(itens);
        }

        System.out.println();

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Mansão");
        listaPolimorfica.add("Cobertura de luxo");
        listaPolimorfica.add("Carro esportivo");

        for (int i = 0; i < listaPolimorfica.size(); i ++) {
            System.out.println(listaPolimorfica);
        }

        System.out.println();

        int i = 0;
        while (i < listaPolimorfica.size()) {
            System.out.println(listaPolimorfica);
            i++;
        }

    }
}
