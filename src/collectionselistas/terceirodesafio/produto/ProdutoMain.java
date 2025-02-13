package collectionselistas.terceirodesafio.produto;

import java.util.ArrayList;
import java.util.List;

/* Crie uma classe Produto com propriedades como nome e preço.
Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.*/
public class ProdutoMain {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Copos de vidro", 30.00);
        Produto produto2 = new Produto("Acessórios decorativos", 30.00);
        Produto produto3 = new Produto("Mesa de centro", 30.00);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        double media;
        double somaDosValores = 0;

        for (Produto produto : produtos) {
            System.out.println(produto);
            somaDosValores += produto.preco;
        }

        media = somaDosValores / produtos.size();
        System.out.printf("O preço médio dos produtos é: %.2f ", media);

    }
}
