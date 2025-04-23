package consumindoapigravandoarquivoselidandocomerros.primeirodesafio;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class IntegracaoApiGoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o título do livro que deseja pesquisar: ");
        var tituloDoLivro = input.nextLine().replace(" ", "");

        var apiKey = "AIzaSyDVKrFnknOD1YlVEHwLd0To2EOzgB7GW-k";

        var enderecoUri = "https://www.googleapis.com/books/v1/volumes?q=" + tituloDoLivro + "&key=" + apiKey;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(enderecoUri)).build();

        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.body());
        input.close();
    }
}
