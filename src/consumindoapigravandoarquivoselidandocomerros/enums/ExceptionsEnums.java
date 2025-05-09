package consumindoapigravandoarquivoselidandocomerros.enums;

public enum ExceptionsEnums {

    SENHA_INVALIDA("A sua senha deve ter pelo menos oito caracteres"),
    CONVERSAO_DE_ANO("Não consegui converter ano porque tem mais de 4 caracteres"),
    ERRO_CONSULTA_GITHUB("Erro, usuário não encontrado"),
    ERRO_CEP_NAO_ENCONTRADO("Erro, cep não encontrado... digite novamente"),
    ERRO_CEP_MAU_IFORMADO("Erro, cep mau informado... digite novamente");

    private final String message;

    ExceptionsEnums(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
