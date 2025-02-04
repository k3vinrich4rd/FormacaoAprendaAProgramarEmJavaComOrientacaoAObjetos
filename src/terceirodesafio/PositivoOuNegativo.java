package terceirodesafio;

/* Crie um programa que solicite ao usuário digitar um número.
Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".*/

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = input.nextDouble();

        if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

        input.close();
    }
}
