import java.util.Scanner;

public class UtilizandoForComScanner {
    public static void main(String[] args) {

        double nota;
        double somaDasNotas = 0;
        double mediaDasNotas = 0;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a " + (i + 1) + "° nota relacionada ao filme: ");
            nota = input.nextDouble();
            somaDasNotas += nota;
            mediaDasNotas = somaDasNotas / 3;
        }

        System.out.printf("De acordo com o que foi prenchido a média das notas é %.2f ", mediaDasNotas);

        input.close();
    }
}
