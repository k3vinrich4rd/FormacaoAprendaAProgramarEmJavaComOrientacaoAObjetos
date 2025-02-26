package poo.screenmatch.segundodesafio.produto;

/*
Desenvolva uma classe Produto com os atributos privados nome e preco.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
 */


public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public void aplicarDesconto(double valorProduto) {
        double desconto = (valorProduto * 10) / 100;
        double produtoComDesconto = valorProduto - desconto;
        System.out.printf("Valor do produto após desconto: %.2f", produtoComDesconto);
    }
}
