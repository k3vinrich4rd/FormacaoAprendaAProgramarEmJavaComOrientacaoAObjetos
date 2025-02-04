package terceirodesafio;

/*Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10. */



import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número e saiba a sua tabuada até 10");
        System.out.print("Número informado: ");
        int numero = input.nextInt();

        int multiplicador;

        for (int i = 1; i <= 10; i++) {
            multiplicador = numero * i;
            System.out.println(i + " * " + i + " = " + multiplicador);
        }

        input.close();
    }
}
