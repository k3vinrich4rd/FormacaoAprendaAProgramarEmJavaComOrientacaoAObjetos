package terceirodesafio;

/* Peça ao usuário para inserir dois números inteiros.
Compare os números e imprima uma mensagem indicando se são iguais,
diferentes, o primeiro é maior ou o segundo é maior.*/

import java.util.Scanner;

public class ComparadorNumerico {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira dois números para efetuar uma comparação numérica\n");

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundoNumero = input.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println("Os números são iguais");
        } else if (primeiroNumero > segundoNumero) {
            System.out.println("O primeiro número é maior que o segundo");
        } else {
            System.out.println("O segundo número é maior que o primeiro");
        }

        input.close();

    }
}
