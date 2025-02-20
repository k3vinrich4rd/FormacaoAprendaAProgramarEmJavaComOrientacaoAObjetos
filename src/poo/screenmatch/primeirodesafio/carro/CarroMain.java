package poo.screenmatch.primeirodesafio.carro;

public class CarroMain {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.modelo = "Corsa Classic";
        carro.cor = "Prata";
        carro.ano = 2005;

        carro.exibirFichaTecnica();
        System.out.println("O automovél tem: " + carro.calculaIdadeAutomovel(carro.ano) + " anos");
    }
}
