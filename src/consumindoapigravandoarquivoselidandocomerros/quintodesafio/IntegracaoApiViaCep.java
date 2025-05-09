package consumindoapigravandoarquivoselidandocomerros.quintodesafio;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class IntegracaoApiViaCep {


    public String conectaApiViaCep(String cepInformado) throws IOException, InterruptedException {
        String uri = "https://viacep.com.br/ws/" + cepInformado + "/json/";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body(); // Retorna o JSON puro
    }
}


