package poo.screenmatch.quartodesafio.conversaofinanceira;

public class ConversaoFinanceiraTest {
    public static void main(String[] args) {

        ConversorMoeda conversorMoeda = new ConversorMoeda();
        conversorMoeda.setDolar(40.00);
        System.out.printf("Valor da conversão para real brasileiro: %.2f", conversorMoeda.converterDolarParaReal(conversorMoeda.getDolar()));
    }
}
