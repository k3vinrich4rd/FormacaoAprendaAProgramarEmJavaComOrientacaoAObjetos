package criandoasuaprimeiraappcomjava.segundodesafio;

//Crie um programa que realize a média de duas notas decimais e exiba o resultado.

public class CalculoDaMediaDeDuasNotas {
    public static void main(String[] args) {

        double primeiraNota = 8.5;
        double segundaNota = 5.9;
        double mediaDasNotas = (primeiraNota + segundaNota) / 2;

        System.out.printf("O resultado da média das duas notas é: %.2f", mediaDasNotas);
    }
}
