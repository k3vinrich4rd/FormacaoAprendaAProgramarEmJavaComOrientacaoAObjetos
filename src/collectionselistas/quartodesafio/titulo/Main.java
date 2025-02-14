package collectionselistas.quartodesafio.titulo;

/*
Crie uma classe Titulo com um atributo nome do tipo String.
Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.

No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista.
Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.
*/

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Titulo titulo1 = new Titulo("Cidade de Deus");
        Titulo titulo2 = new Titulo("Auto da compadecida");
        Titulo titulo3 = new Titulo("O homem que copiava");

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(titulo1);
        listaDeTitulos.add(titulo2);
        listaDeTitulos.add(titulo3);

        listaDeTitulos.sort(Comparator.comparing(Titulo::getNome));
        System.out.println("Lista ordenada por Título: ");
        System.out.println(listaDeTitulos);


    }
}
