package poo.screenmatch.quartodesafio.produtoquantidade;

public class Test {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.setPrecoProduto(30);
        produto.precoFinalProduto(3);
        produto.aplicarDesconto(3);







        Servico servico = new Servico();
        servico.setPrecoProduto(30);
        servico.precoFinalProduto(7);
        System.out.println("Valor do produto com desconto: " + servico.aplicarDesconto(7));

    }
}
