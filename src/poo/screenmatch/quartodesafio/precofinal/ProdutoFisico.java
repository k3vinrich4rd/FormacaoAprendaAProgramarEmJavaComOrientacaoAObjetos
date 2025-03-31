package poo.screenmatch.quartodesafio.precofinal;

public class ProdutoFisico implements Calculavel {
    @Override
    public double calcularPrecoFinal(double precoProduto) {
        double taxaSobreProduto = precoProduto * 0.05;
        return taxaSobreProduto + precoProduto;

    }
}
