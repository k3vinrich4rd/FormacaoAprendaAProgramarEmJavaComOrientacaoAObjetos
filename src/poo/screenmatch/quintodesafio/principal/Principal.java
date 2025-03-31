package poo.screenmatch.quintodesafio.principal;

import poo.screenmatch.quintodesafio.modelo.Musica;
import poo.screenmatch.quintodesafio.modelo.MusicaFavorita;
import poo.screenmatch.quintodesafio.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica mySong = new Musica();
        mySong.setTitulo("Sete da manhã");
        mySong.setArtista("Kevin Richard");

        for (int i = 0; i < 1000; i ++) {
            mySong.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            mySong.curte();
        }

        System.out.println("Nota de classificação da música: " + mySong.getClassificacao());

        Podcast myPodcast = new Podcast();
        myPodcast.setTitulo("Bolha dev");
        myPodcast.setHostPodcast("Kevin Richard");

        for (int i = 0; i < 5000; i++) {
            myPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.curte();
        }

        System.out.println("Nota de classificação do podcast: " + myPodcast.getClassificacao());

        MusicaFavorita musicaFavorita = new MusicaFavorita();
        musicaFavorita.inclui(mySong);
        musicaFavorita.inclui(myPodcast);


    }
}
