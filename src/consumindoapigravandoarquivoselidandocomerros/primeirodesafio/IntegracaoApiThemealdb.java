package consumindoapigravandoarquivoselidandocomerros.primeirodesafio;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class IntegracaoApiThemealdb {
    public static void main(String[] args) throws IOException, InterruptedException {

        var input = new Scanner(System.in);
        System.out.print("Digite o nome da receita para a busca: ");
        var receita = input.nextLine();
        var client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.themealdb.com/api/json/v1/1/search.php?s=" + receita)).build();


        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.body());

        input.close();

    }
}
