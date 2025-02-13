package collectionselistas.segundodesafio;

public class ProdutoPerecivel extends Produto {

    String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto Perecível: " + nome +
                ", Data de validade: " + dataValidade +
                ", Preco: " + preco +
                " e Quantidade: " + quantidade;
    }
}



