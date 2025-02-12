package collectionselistas.project.segundodesafio;

/*Crie uma classe Produto com atributos como nome, preco, e quantidade.
Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList.
Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.
Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto.
Em seguida, imprima a lista de produtos utilizando o método System.out.println().
Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos.
Em seguida, crie objetos Produto utilizando esse novo construtor.
Crie uma classe ProdutoPerecivel que herde de Produto.
Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super)
para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel e imprima seus valores.*/

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + "Preco: " + preco +  " Quantidade: " + quantidade;
    }
}
