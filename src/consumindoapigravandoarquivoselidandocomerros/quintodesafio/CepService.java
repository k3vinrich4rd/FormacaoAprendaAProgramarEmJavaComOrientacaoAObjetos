package consumindoapigravandoarquivoselidandocomerros.quintodesafio;

import consumindoapigravandoarquivoselidandocomerros.enums.ExceptionsEnums;
import consumindoapigravandoarquivoselidandocomerros.exception.ErroConsultaNaoEncontradaApiViaCepException;
import consumindoapigravandoarquivoselidandocomerros.exception.ErroMauPreenchidaApiViaCepException;

import java.net.http.HttpResponse;

public class CepService {

    public void validarStatus404RespostaViaCep(HttpResponse<String> response) throws ErroConsultaNaoEncontradaApiViaCepException {

        if (response.statusCode() == 404) {
            throw new ErroConsultaNaoEncontradaApiViaCepException(ExceptionsEnums.ERRO_CEP_NAO_ENCONTRADO.getMessage());
        }
    }

    public void validarStatus400RespostaViaCep(HttpResponse<String> response) {

        if (response.statusCode() == 400) {
            throw new ErroConsultaNaoEncontradaApiViaCepException(ExceptionsEnums.ERRO_CEP_MAU_IFORMADO.getMessage());
        }

    }

    public void validarFormatoCep(String cep) {
        if (!cep.matches("\\d{8}")) {
            throw new ErroMauPreenchidaApiViaCepException(ExceptionsEnums.ERRO_CEP_MAU_IFORMADO.getMessage());
        }
    }

}