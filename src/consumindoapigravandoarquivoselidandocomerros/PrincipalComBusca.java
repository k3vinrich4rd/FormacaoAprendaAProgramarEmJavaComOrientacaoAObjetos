package consumindoapigravandoarquivoselidandocomerros;

import collectionselistas.Titulo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import poo.screenmatch.modelo.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o filme que deseja buscar: ");
        var filmeDigitado = input.nextLine();
        var enderecoUri = "https://www.omdbapi.com/?t=" + filmeDigitado + "&apikey=2367b394";

        // Cria um cliente HTTP para enviar requisições
        HttpClient client = HttpClient.newHttpClient();
        // Constrói uma requisição HTTP do tipo GET para a URL especificada
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(enderecoUri)) // Define o URI da API OMDB com o filme "Matrix" e a chave de API
                .build(); // Finaliza a construção da requisição

        // Envia a requisição e obtém a resposta como uma string
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());//O segundo parâmetro, HttpResponse.BodyHandlers.ofString(), indica que o corpo da resposta será tratado como uma string.


        String json = response.body();
        // Imprime o corpo da resposta no console
        System.out.println(json);

        //É possível fazer um builder com Gson
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        System.out.println("Título provisório: ");
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);

        System.out.println("Meu título: ");
        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        System.out.println(meuTitulo);

        input.close();
    }

}
