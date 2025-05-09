package consumindoapigravandoarquivoselidandocomerros.exception;

public class ErroConsultaGitHubException extends Throwable {

    private final String message;

    public ErroConsultaGitHubException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

   
}
