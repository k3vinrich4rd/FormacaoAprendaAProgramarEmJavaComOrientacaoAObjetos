package poo.screenmatch.primeirodesafio.musica;

public class MusicaMain {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.titulo = "Sete da manhã";
        musica.artista = "Kevin Richard";
        musica.anoDeLancamento = 2025;

        musica.avaliarMusica(10);
        musica.avaliarMusica(6.5);
        musica.avaliarMusica(7.0);
        musica.avaliarMusica(9.0);

        musica.exibirFichaTecnica();

        System.out.println("Média das avaliações: " + musica.mediaDasAvaliacoes());



    }
}
