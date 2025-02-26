package poo.screenmatch.segundodesafio.produto;

public class ProdutoMain {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.setNome("Vassoura de limpeza");
        produto.setPreco(40);
        produto.aplicarDesconto(produto.getPreco());

    }
}
