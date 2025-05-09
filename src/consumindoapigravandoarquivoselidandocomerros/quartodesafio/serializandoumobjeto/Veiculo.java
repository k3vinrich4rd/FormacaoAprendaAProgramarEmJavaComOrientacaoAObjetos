package consumindoapigravandoarquivoselidandocomerros.quartodesafio.serializandoumobjeto;

public class Veiculo {

    private final String modelo;
    private final String cor;

    public Veiculo(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }


    public String getModelo() {
        return this.modelo;
    }

    public String getCor() {
        return this.cor;
    }
}

