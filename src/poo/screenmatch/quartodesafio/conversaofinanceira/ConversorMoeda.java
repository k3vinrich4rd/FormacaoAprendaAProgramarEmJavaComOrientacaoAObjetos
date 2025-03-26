package poo.screenmatch.quartodesafio.conversaofinanceira;
/*
Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal()
                                                                                         para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.
 */
public class ConversorMoeda implements ConversaoFinanceira {

    private double dolar;

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    @Override
    public double converterDolarParaReal(double dolar) {
        return dolar * 5.70;
    }
}
