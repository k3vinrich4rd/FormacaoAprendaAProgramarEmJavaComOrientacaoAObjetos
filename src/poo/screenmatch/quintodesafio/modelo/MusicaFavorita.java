package poo.screenmatch.quintodesafio.modelo;

public class MusicaFavorita {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + "é considerado um sucesso");
        }else {
            System.out.println(audio.getTitulo() + " também está em alta, mas não tão bem classificada");
        }
    }

}
