package consumindoapigravandoarquivoselidandocomerros;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.net.http.*;
import java.net.URI;
import java.util.Scanner;
import java.io.FileWriter;

import collectionselistas.Titulo;
import com.google.gson.*;
import com.google.gson.FieldNamingPolicy;
import consumindoapigravandoarquivoselidandocomerros.exception.ErrorDeConversaDeAnoException;
import poo.screenmatch.modelo.TituloOmdb;

public class BuscaFilme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o filme que deseja buscar: ");
        String filmeDigitado = input.nextLine();
        String filmeEncoded = URLEncoder.encode(filmeDigitado, StandardCharsets.UTF_8);
        String enderecoUri = "https://www.omdbapi.com/?t=" + filmeEncoded + "&apikey=2367b394";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(enderecoUri))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);

            // Verifica se a resposta da API indica erro
            JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
            if (jsonObject.has("Response") && jsonObject.get("Response").getAsString().equals("False")) {
                System.out.println("Erro da API: " + jsonObject.get("Error").getAsString());
                return;
            }

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .setPrettyPrinting()
                    .create();

            System.out.println("Título provisório: ");
            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Meu título: ");
            System.out.println(meuTitulo);

            // try-with-resources para garantir fechamento do arquivo
            try (FileWriter escrita = new FileWriter("filmes.txt")) {
                escrita.write(meuTitulo.toString());
            }

        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca, verifique o endereço");
        } catch (ErrorDeConversaDeAnoException errorDeConversaDeAnoException) {
            System.out.println(errorDeConversaDeAnoException.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            input.close();
        }

        System.out.println("O programa finalizou corretamente");
    }
}