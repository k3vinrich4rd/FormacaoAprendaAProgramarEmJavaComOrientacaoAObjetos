package poo.screenmatch.terceirodesafio.carro;

/*Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
Implemente métodos para definir o nome do modelo, os preços médios para cada ano,
e calcular e exibir o menor e o maior preço.
Adicione uma subclasse ModeloCarro para criar instâncias específicas,
utilizando-a na classe principal para definir preços e mostrar informações. */

public class Carro {
    private String modelo;
    private double precoMedioPrimeiroano;
    private double precoMedioSegundoAno;
    private double precoMedioTerceiroAno;


    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPreco(double precoMedioPrimeiroano, double precoMedioSegundoAno, double precoMedioTerceiroAno) {
        this.precoMedioPrimeiroano = precoMedioPrimeiroano;
        this.precoMedioSegundoAno = precoMedioSegundoAno;
        this.precoMedioTerceiroAno = precoMedioTerceiroAno;
    }

    public void exibirInfomacao() {
        System.out.println("Modelo do carro: " + this.modelo);
        System.out.println("Preço do carro no primeiro ano: " + precoMedioPrimeiroano);
        System.out.println("Preço do carro no segundo ano: " + precoMedioSegundoAno);
        System.out.println("Preço do carro no terceiro ano: " + precoMedioTerceiroAno);
        System.out.println("Maior preço: " + maiorPreco());
        System.out.println("Menor preço: " + menorPreco());
    }


    public double menorPreco() {
        double menorPreco = precoMedioPrimeiroano;

        if (precoMedioSegundoAno < menorPreco) {
            menorPreco = precoMedioSegundoAno;

        } else if (precoMedioTerceiroAno < menorPreco) {
            menorPreco = precoMedioTerceiroAno;
        }

        return menorPreco;
    }

    public double maiorPreco() {
        double maiorPreco = precoMedioPrimeiroano;

        if (precoMedioSegundoAno > maiorPreco) {
            maiorPreco = precoMedioSegundoAno;

        } else if (precoMedioTerceiroAno > maiorPreco) {
            maiorPreco = precoMedioTerceiroAno;
        }

        return maiorPreco;
    }


}



