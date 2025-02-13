package criandoasuaprimeiraappcomjava.segundodesafio;

 /*Declare uma variável do tipo double e uma variável do tipo int.
 Faça o casting da variável double para int e imprima o resultado. */

public class Casting {
    public static void main(String[] args) {

        double numeroComUmPontoFlutuante = 8.5;
        int numeroInteiro = 5;
        int casting = (int) numeroComUmPontoFlutuante;

        System.out.println("Número com ponto flutuante: " + numeroInteiro);
        System.out.println("Número inteiro: " + numeroInteiro);
        System.out.println("Número com ponto flutuante mas com casting: " + casting);
    }
}
