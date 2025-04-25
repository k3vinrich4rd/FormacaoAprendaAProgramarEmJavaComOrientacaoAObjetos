package consumindoapigravandoarquivoselidandocomerros.terceirodesafio.enums;

public enum ExceptionsEnums {

    SENHA_INVALIDA("A sua senha deve ter pelo menos oito caracteres"),
    CONVERSAO_DE_ANO("Não consegui converter ano porque tem mais de 4 caracteres");

    private final String message;

    ExceptionsEnums(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
