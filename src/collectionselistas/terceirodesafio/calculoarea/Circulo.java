package collectionselistas.terceirodesafio.calculoarea;

public class Circulo implements Forma {
    @Override
    public double calcularArea(double valorArea) {
        double pi = 3.14159;
        return Math.pow(valorArea, 2) * pi;
    }
}
