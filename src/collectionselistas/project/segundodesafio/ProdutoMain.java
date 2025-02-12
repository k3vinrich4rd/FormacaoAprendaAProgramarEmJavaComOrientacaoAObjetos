package collectionselistas.project.segundodesafio;

import java.util.ArrayList;
import java.util.List;

public class ProdutoMain {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Vassoura", 15.50, 1);
        Produto produto2 = new Produto("Papel higiênico", 20.00, 3);
        Produto produto3 = new Produto("Refrigerante", 12.00, 1);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println("Tamanho da lista de produtos: " + produtos.size());
        System.out.println("Primeiro produto da lista: " + produtos.get(0));
        System.out.println("Lista de produtos: " + produtos);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Bolacha", 2.50, 4, "15/02/2025");
        System.out.println("Informações referentes ao produto perecível: " + produtoPerecivel);

    }
}
