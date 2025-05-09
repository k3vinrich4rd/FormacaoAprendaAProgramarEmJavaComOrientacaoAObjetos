package consumindoapigravandoarquivoselidandocomerros.quartodesafio.serializandoumobjeto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TesteSerializacaoVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Sedan", "Preto");
        Gson gson = new GsonBuilder()
                        .setPrettyPrinting()
                        .create();

        System.out.println("Objeto Serializado");
        String json = gson.toJson(veiculo);
        System.out.println(json);
    }
}
