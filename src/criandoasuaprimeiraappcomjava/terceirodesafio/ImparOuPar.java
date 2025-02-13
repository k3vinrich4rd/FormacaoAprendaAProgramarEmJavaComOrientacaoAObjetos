package criandoasuaprimeiraappcomjava.terceirodesafio;

/*Crie um programa que solicite ao usuário a entrada de um número inteiro.
Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
 */

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro para saber se o mesmo é ímpar ou par: ");
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número informado é par");
        } else {
            System.out.println("O número informado é ímpar");
        }
    }
}
