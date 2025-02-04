import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    public static void main(String[] args) {

        System.out.println("-------------------------");
        System.out.println("Jogo das tentativas");
        System.out.println("-------------------------");
        System.out.println("Instruções do jogo:");
        System.out.println("Você deve digitar um número que seja igual ao número aleatório entre 0 a 100\n");

        int numeroAletorio = new Random().nextInt(100);
        int tentativas = 0;

        Scanner input = new Scanner(System.in);

        while (tentativas < 5) {

            System.out.print((tentativas + 1) + "° tentativa, digite um número de 0 a 100: ");
            int numeroInformado = input.nextInt();
            tentativas++;

            if (numeroInformado == numeroAletorio) {
                System.out.println("Parabéns, você acertou o número aleatório\n");
                break;
            } else if (numeroInformado < numeroAletorio) {
                System.out.println("O número informado é menor que o número aleatório\n");
            } else {
                System.out.println("O número informado é maior que o número aleatório\n");
            }
        }

        System.out.println("O número aleatório era: " + numeroAletorio + "\nQuantidade de tentativas: " + tentativas);
        input.close();
    }
}
