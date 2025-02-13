package collectionselistas.terceirodesafio.produto;

/* Crie uma classe Produto com propriedades como nome e preço.
Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.*/
public class Produto {

    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: " + preco;
    }
}
