package consumindoapigravandoarquivoselidandocomerros.terceirodesafio;

import consumindoapigravandoarquivoselidandocomerros.terceirodesafio.enums.ExceptionsEnums;
import consumindoapigravandoarquivoselidandocomerros.terceirodesafio.exception.ErroConsultaGitHubException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

/* Desenvolva um programa em Java que permite aos usuários consultar
informações sobre um usuário do GitHub (utilize a API pública do GitHub para obter os dados).
Crie uma classe de exceção personalizada, ErroConsultaGitHubException, que estende RuntimeException.
Lance essa exceção quando o nome de usuário não for encontrado. No bloco catch,
trate de forma específica essa exceção, exibindo uma mensagem amigável.*/

public class IntegracaoApiGithub {

    public static void main(String[] args) throws IOException, InterruptedException, ErroConsultaGitHubException {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Informe o nome do seu user nome GitHub: ");
            String userName = input.nextLine();
            String endereco = "https://api.github.com/users/" + userName;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            validarUsername(response);
            System.out.println(response.body());

        } catch (IOException | InterruptedException | ErroConsultaGitHubException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void validarUsername(HttpResponse<String> response) throws ErroConsultaGitHubException {
        if (response.statusCode() == 404) {
            throw new ErroConsultaGitHubException(ExceptionsEnums.ERRO_CONSULTA_GITHUB.getMessage());
        }
    }
}

