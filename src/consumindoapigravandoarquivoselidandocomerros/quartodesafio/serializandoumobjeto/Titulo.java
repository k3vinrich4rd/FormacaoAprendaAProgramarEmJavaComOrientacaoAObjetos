package consumindoapigravandoarquivoselidandocomerros.quartodesafio.serializandoumobjeto;

public class Titulo {
    private final String nomeFilme;
    private final String generoFilme;

    public Titulo(String nomeFilme, String generoFilme) {
        this.nomeFilme = nomeFilme;
        this.generoFilme = generoFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public String getGeneroFilme() {
        return generoFilme;
    }
}
