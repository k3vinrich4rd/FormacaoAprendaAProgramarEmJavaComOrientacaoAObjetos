package poo.screenmatch;

import poo.screenmatch.calculo.CalculadoraDeTempo;
import poo.screenmatch.modelo.Filme;
import poo.screenmatch.modelo.Serie;
import poo.screenmatch.primeirodesafio.calculadora.Calculadora;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão ");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);


        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibirFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());


        Filme outroFimel = new Filme();
        outroFimel.setNome("O poderoso chefão ");
        outroFimel.setAnoDeLancamento(2023);
        outroFimel.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFimel);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());


    }
}
