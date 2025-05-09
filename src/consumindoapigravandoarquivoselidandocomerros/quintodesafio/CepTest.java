package consumindoapigravandoarquivoselidandocomerros.quintodesafio;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import consumindoapigravandoarquivoselidandocomerros.enums.ExceptionsEnums;
import consumindoapigravandoarquivoselidandocomerros.exception.ErroConsultaNaoEncontradaApiViaCepException;
import consumindoapigravandoarquivoselidandocomerros.exception.ErroMauPreenchidaApiViaCepException;

import java.io.IOException;
import java.util.Scanner;

public class CepTest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite seu cep para efetuar uma busca: ");
            String cepInformado = input.nextLine();

            CepService cepService = new CepService();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            try {
                // Valida o formato do CEP antes de consultar a API
                cepService.validarFormatoCep(cepInformado);

                // Realiza a consulta na API ViaCep e obtém o JSON
                IntegracaoApiViaCep integracaoApiViaCep = new IntegracaoApiViaCep();
                String jsonResponse = integracaoApiViaCep.conectaApiViaCep(cepInformado);

                // Converte o JSON para objeto Endereco
                Endereco endereco = gson.fromJson(jsonResponse, Endereco.class);

                // Exibe o endereço formatado
                System.out.println(endereco);

                // Salva o JSON original retornado pela API em um arquivo
                try {
                    GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
                    geradorDeArquivo.salvaJson(endereco.cep(), jsonResponse); // Salva o JSON puro
                } catch (IOException e) {
                    System.err.println("Erro ao salvar arquivo: " + e.getMessage());
                }

            } catch (ErroConsultaNaoEncontradaApiViaCepException e) {
                System.err.println("Descrição do erro: " + ExceptionsEnums.ERRO_CEP_NAO_ENCONTRADO.getMessage());
            } catch (ErroMauPreenchidaApiViaCepException e) {
                System.err.println("Descrição do erro: " + ExceptionsEnums.ERRO_CEP_MAU_IFORMADO.getMessage());
            } catch (IOException | InterruptedException e) {
                System.err.println("Erro de comunicação ou IO: " + e.getMessage());
            }
        }
    }
}