package poo.screenmatch.calculo;

import poo.screenmatch.modelo.Filme;
import poo.screenmatch.modelo.Serie;
import poo.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme filme) {
//        tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie serie) {
//        tempoTotal += serie.getDuracaoEmMinutos();
//
//    }










        public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();

    }
}
