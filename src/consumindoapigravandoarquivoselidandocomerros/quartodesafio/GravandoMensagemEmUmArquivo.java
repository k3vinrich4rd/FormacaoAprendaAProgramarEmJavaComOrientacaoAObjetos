package consumindoapigravandoarquivoselidandocomerros.quartodesafio;

import java.io.FileWriter;
import java.io.IOException;

public class GravandoMensagemEmUmArquivo {
    public static void main(String[] args) throws IOException {

        try (FileWriter fileWriter = new FileWriter("arquivo.txt")) {
            fileWriter.write("Conteúdo a ser gravado no arquivo");
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}
