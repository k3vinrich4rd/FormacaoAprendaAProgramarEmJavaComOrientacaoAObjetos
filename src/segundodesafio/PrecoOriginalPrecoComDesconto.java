package segundodesafio;

/* Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto
e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.*/

public class PrecoOriginalPrecoComDesconto {
    public static void main(String[] args) {

        double precoOriginal = 500;
        double valorDesconto = (precoOriginal * 10) / 100;
        double valorDoProdutoComDesconto = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.printf("O valor do produto com desconto é: %.2f R$", valorDoProdutoComDesconto);

    }
}
