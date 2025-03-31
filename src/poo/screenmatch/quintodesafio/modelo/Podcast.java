
package poo.screenmatch.quintodesafio.modelo;

public class Podcast extends Audio {

    private String hostPodcast;
    private String descricao;

    public String getHostPodcast() {
        return hostPodcast;
    }

    public void setHostPodcast(String hostPodcast) {
        this.hostPodcast = hostPodcast;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500) {
           return 10;
        } else {
            return 8;
        }
    }
}
