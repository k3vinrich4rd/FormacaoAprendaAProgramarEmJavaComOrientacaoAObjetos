package collectionselistas.primeirodesafio;

import java.util.ArrayList;

public class PessoaMain {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Tim Maia";
        pessoa1.idade = 55;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Jorge ben Jor";
        pessoa2.idade = 85;

        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "Djavan";
        pessoa3.idade = 76;

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + pessoas.size());
        System.out.println("Primeira pessoa da lista: " + pessoas.get(0).nome);
        System.out.print("Lista completa: " + pessoas);

    }
}
