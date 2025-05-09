package consumindoapigravandoarquivoselidandocomerros.quartodesafio.serializandoumobjeto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TesteSerializacaoTitulo {
    public static void main(String[] args) {
        Titulo titulo = new Titulo("Pecadores", "Terror-Drama");
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(titulo);
        System.out.println(json);
    }
}
