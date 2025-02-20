package poo.screenmatch.primeirodesafio.musica;

/* Crie uma classe Música com atributos titulo, artista, anoLancamento,
avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica,
avaliar a música e calcular a média de avaliações.*/

public class Musica {

    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("Titulo da música: " + this.titulo);
        System.out.println("Artista: " + this.artista);
        System.out.println("Ano de lançamento: " + this.anoDeLancamento);
        System.out.println("Nota Avaliação: " + this.avaliacao);
        System.out.println("Número de avaliações: " + this.numAvaliacoes);
    }


    void avaliarMusica(double notaDaAvaliacao) {
        avaliacao += notaDaAvaliacao;
        numAvaliacoes++;
    }

    double mediaDasAvaliacoes() {
        return avaliacao / numAvaliacoes;
    }


}
