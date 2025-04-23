package consumindoapigravandoarquivoselidandocomerros.segundodesafio.livro;

import com.google.gson.Gson;

import java.util.Scanner;

public class TestLivroconversaoParaObjeto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o título do livro: ");
        String titulo = input.nextLine();

        System.out.print("Informe o nome do autor: ");
        String autor = input.nextLine();

        System.out.print("Informe o nome da editora: ");
        String nome = input.nextLine();

        System.out.println("Informe a cidade: ");
        String cidade = input.nextLine();

        String jsonString = String.format(
                "{\"titulo\":\"%s\",\"autor\":\"%s\",\"editora\":{\"nome\":\"%s\",\"cidade\":\"%s\"}}",
                titulo, autor, nome, cidade);

        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonString, Livro.class);
        System.out.println(livro);
    }
}
