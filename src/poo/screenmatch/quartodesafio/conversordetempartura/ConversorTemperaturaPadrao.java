package poo.screenmatch.quartodesafio.conversordetempartura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void celsiusParaFahrenheit(double temperatura) {
        double temperaturaFahrenheit = (temperatura * 1.8) + 32;
        System.out.println("O resultado da conversão da temperatura de Celsius para Fahrenheit é: " + temperaturaFahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(double temperatura) {
        double temperaturaCelsius = ((temperatura - 32) / 9) * 5;
        System.out.println("O resultado da conversão da temperatura de Fahrenheit para Celsius é: " + temperaturaCelsius);
    }
}
