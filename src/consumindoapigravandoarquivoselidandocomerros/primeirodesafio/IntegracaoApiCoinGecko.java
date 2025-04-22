package consumindoapigravandoarquivoselidandocomerros.primeirodesafio;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class IntegracaoApiCoinGecko {
    public static void main(String[] args) throws InterruptedException, IOException {

        var input = new Scanner(System.in);
        System.out.print("Digite o nome da cripto moeda que deseja pesquisar: ");
        var criptoMoeda = input.nextLine();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.coingecko.com/api/v3/simple/price?ids=" + criptoMoeda + "&vs_currencies=brl")).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
