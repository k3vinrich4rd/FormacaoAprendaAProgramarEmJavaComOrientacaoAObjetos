package poo.screenmatch.quartodesafio.calculadorasalaretangular;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double altura;
    private double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double calcularArea(double altura, double largura) {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        return (altura + largura) * 2;


    }
}
