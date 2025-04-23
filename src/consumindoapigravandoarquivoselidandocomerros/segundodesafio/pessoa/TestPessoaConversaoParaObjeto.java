package consumindoapigravandoarquivoselidandocomerros.segundodesafio.pessoa;

import com.google.gson.Gson;

import java.util.Scanner;

public class TestPessoaConversaoParaObjeto {
    public static void main(String[] args) {

        // Importa a classe Scanner para ler a entrada do usuário
        Scanner input = new Scanner(System.in);

        // Solicita ao usuário que digite seu nome
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine(); // Lê a linha completa como o nome do usuário

        // Solicita ao usuário que informe sua idade
        System.out.print("Informe a sua idade: ");
        int idade = input.nextInt(); // Lê a idade como um inteiro
        input.nextLine(); // Consome a quebra de linha pendente após a leitura do inteiro

        // Solicita ao usuário que informe sua cidade
        System.out.print("Informe a sua cidade: ");
        String cidade = input.nextLine(); // Lê a linha completa como a cidade do usuário

        // Cria uma string JSON formatada com os valores recebidos
        String jsonString = String.format("{\"nome\":\"%s\",\"idade\":%d,\"cidade\":\"%s\"}", nome, idade, cidade);

        // Cria uma instância de Gson para converter a string JSON em um objeto Java
        Gson gson = new Gson();

        // Converte a string JSON em um objeto da classe Pessoa
        Pessoa pessoa = gson.fromJson(jsonString, Pessoa.class);

        // Imprime o objeto Pessoa, que deve ter um método toString() para exibir os dados
        System.out.println(pessoa);
    }
}
