package poo.screenmatch.quartodesafio.tabuada;

public class TabuadaMultiplicacao implements Tabuada {


    @Override
    public void mostrarTabuada(int numero) {
        int multiplicador;

        for (int i = 0; i <= 10; i++) {
            multiplicador = numero * i;
            System.out.println(i + " x " + numero + " = " + multiplicador);
        }
    }
}
