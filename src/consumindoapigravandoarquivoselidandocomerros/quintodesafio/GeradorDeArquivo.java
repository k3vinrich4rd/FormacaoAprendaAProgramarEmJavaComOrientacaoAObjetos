package consumindoapigravandoarquivoselidandocomerros.quintodesafio;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void salvaJson(String nomeArquivo, String json) throws IOException {
        try (FileWriter fileWriter = new FileWriter(nomeArquivo + ".json")) {
            fileWriter.write(json);
        }
    }
}
