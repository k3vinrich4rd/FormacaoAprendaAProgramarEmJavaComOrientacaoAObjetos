package poo.screenmatch.terceirodesafio.carro;

public class TestCarro {
    public static void main(String[] args) {
       ModeloCarro modeloCarro = new ModeloCarro();
        modeloCarro.definirModelo("SUV");
        modeloCarro.definirPreco(3500000, 3435095, 2300000);
        modeloCarro.maiorPreco();
        modeloCarro.menorPreco();
        modeloCarro.exibirInfomacao();
    }
}
