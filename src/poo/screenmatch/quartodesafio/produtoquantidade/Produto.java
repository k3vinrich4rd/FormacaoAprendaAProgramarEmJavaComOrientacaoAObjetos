package poo.screenmatch.quartodesafio.produtoquantidade;

public class Produto implements Vendavel{

    private double precoProduto;

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public void precoFinalProduto(int quantidadeProduto) {
        precoProduto = quantidadeProduto * precoProduto;
    }

    @Override
    public double aplicarDesconto(int quantidadeProduto) {
        double taxaSobreProduto = 0;
        if (quantidadeProduto >= 5) {
            taxaSobreProduto = precoProduto * 0.05;
        } else {
            System.out.println("Você não tem direito a desconto");
        }

        return taxaSobreProduto;
    }
}
