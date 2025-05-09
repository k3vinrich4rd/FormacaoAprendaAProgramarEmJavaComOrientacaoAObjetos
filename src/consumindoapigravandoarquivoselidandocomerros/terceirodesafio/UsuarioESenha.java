package consumindoapigravandoarquivoselidandocomerros.terceirodesafio;

/*Crie um programa que lê uma senha do usuário.
Utilize o bloco try/catch para capturar a exceção SenhaInvalidaException,
uma classe de exceção personalizada que deve ser lançada caso a senha
não atenda a critérios específicos (por exemplo, ter pelo menos 8 caracteres). */

import consumindoapigravandoarquivoselidandocomerros.enums.ExceptionsEnums;
import consumindoapigravandoarquivoselidandocomerros.exception.SenhaInvalidaException;

import java.util.Scanner;

public class UsuarioESenha {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o seu nome de usuário: ");
        String nomeDeUsuario = input.nextLine();
        System.out.print("Digite a sua senha: ");
        String senhaDeUsuario = input.nextLine();

        try {


            validaSenha(senhaDeUsuario);
            System.out.println("Usuário autenticado com sucesso, olá " + nomeDeUsuario);
        } catch (SenhaInvalidaException senhaInvalidaException) {
            System.out.println(senhaInvalidaException.getMessage());
        }

    }

    private static void validaSenha(String senhaDeUsuario) {
        if (senhaDeUsuario.length() < 8) {
            throw new SenhaInvalidaException(ExceptionsEnums.SENHA_INVALIDA.getMessage());
        }
    }
}
