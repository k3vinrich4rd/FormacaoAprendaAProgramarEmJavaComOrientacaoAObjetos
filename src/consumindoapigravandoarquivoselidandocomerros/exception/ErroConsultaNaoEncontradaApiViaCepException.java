package consumindoapigravandoarquivoselidandocomerros.exception;

public class ErroConsultaNaoEncontradaApiViaCepException extends RuntimeException{

    private final String message;

    public ErroConsultaNaoEncontradaApiViaCepException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
