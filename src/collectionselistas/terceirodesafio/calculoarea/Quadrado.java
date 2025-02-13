package collectionselistas.terceirodesafio.calculoarea;

public class Quadrado implements Forma {
    @Override
    public double calcularArea(double valorArea) {
        return Math.pow(valorArea, 2);
    }
}
