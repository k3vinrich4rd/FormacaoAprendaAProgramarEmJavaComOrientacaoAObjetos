package consumindoapigravandoarquivoselidandocomerros.exception;

public class ErroMauPreenchidaApiViaCepException extends RuntimeException{

    private final String message;

    public ErroMauPreenchidaApiViaCepException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
