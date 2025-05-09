package consumindoapigravandoarquivoselidandocomerros.exception;

public class ErrorDeConversaDeAnoException extends RuntimeException {

    private final String message;


    public ErrorDeConversaDeAnoException(String message) {
        this.message = message;
    }


    @Override
    public String getMessage() {
        return this.message;
    }
}
