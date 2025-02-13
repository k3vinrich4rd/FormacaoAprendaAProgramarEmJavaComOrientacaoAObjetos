package criandoasuaprimeiraappcomjava.segundodesafio;

/*Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.*/

public class PrecoProdutoUnidade {
    public static void main(String[] args) {

        double precoProduto = 35.50;
        int quantidade = 5;
        double valorTotalDoProduto = precoProduto * quantidade;

        System.out.printf("O valor final do preço do produto é: %.2f ", valorTotalDoProduto);

    }
}
