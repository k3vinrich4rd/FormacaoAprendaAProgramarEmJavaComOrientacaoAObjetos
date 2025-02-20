package poo.screenmatch.primeirodesafio.carro;

//Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

public class Carro {
    String modelo;
    int ano;
    String cor;


    void exibirFichaTecnica() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
    }

     int calculaIdadeAutomovel(int ano) {
        return 2025 - ano;
    }
}
