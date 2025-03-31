package poo.screenmatch.quartodesafio.precofinal;

public class Livro implements Calculavel {

    @Override
    public double calcularPrecoFinal(double precoProduto) {
        double taxaSobreProduto = precoProduto * 0.03;
        return taxaSobreProduto + precoProduto;

    }
}