package criandoasuaprimeiraappcomjava.terceirodesafio;

/* Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.*/

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite '1' para calcular a área do quadrado e digite '2' para calcular a área do circulo");
        System.out.print("Número informado: ");
        int numeroInformado = input.nextInt();

        switch (numeroInformado) {
            case 1:
                System.out.print("Informe um número para calcular a área do quadrado: ");
                double valorQuadrado = input.nextDouble();
                double areaDoQuadrado = Math.pow(valorQuadrado, 2);
                System.out.printf("A area do quadrado é: %.2f ", areaDoQuadrado);
                break;
            case 2:
                System.out.print("Informe um número para calcular a área do circulo: ");
                double valorCirculo = input.nextDouble();
                double pi = 3.14159;
                double areaDoCirculo = valorCirculo * valorCirculo * pi;
                System.out.printf("A área do circulo é: %.2f ", areaDoCirculo);
                break;
            default:
                System.out.println("Valor inválido");
        }
        input.close();

    }
}
