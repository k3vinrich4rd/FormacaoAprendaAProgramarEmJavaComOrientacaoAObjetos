import java.util.Scanner;

public class UtilizandoWhileComScanner {
    public static void main(String[] args) {

        double nota = 0;
        double somaDasNotas = 0;
        double mediaDasNotas = 0;
        int interator = 0;

        Scanner input = new Scanner(System.in);
        while (nota != -1) {

            System.out.print("Digite a " + (interator) + "° nota relacionada ao filme ou menos um (-1) " +
                    "para parar a execução do programa: ");

            nota = input.nextDouble();

            if (!(nota == -1)) {
                somaDasNotas += nota;
                interator++;
                mediaDasNotas = somaDasNotas / interator;

            } else {
                System.out.println("Ok encerrando o programa");
            }
        }

        System.out.printf("De acordo com o que foi prenchido a média das notas é %.2f ", mediaDasNotas);

        input.close();
    }
}
