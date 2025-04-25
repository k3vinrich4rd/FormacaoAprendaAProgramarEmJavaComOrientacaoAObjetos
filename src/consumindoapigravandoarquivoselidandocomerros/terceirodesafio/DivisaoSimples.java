package consumindoapigravandoarquivoselidandocomerros.terceirodesafio;

import java.util.Scanner;


/* Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo.
Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.*/

public class DivisaoSimples {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int numerador = input.nextInt();
        System.out.print("Informe o segundo número: ");
        int denominador = input.nextInt();

        try {
            int resultadoDaDivisao = numerador / denominador;
            System.out.println(resultadoDaDivisao);

        } catch (ArithmeticException arithmeticException) {
            System.out.println("Erro: Divisão por zero não é permitida");
        }
        input.close();

    }
}
