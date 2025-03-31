
package poo.screenmatch.quintodesafio.modelo;

public class Musica extends Audio {

    private String album;
    private String artista;
    private String generoMusical;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeReproducoes() > 2000 ) {
            return 10;
        }
        else {
            return 7;
        }
    }
}
