public class ConversaoDeTemperatura {
    public static void main(String[] args) {

        double temperaturaEmCelsius = 30;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;
        int resultado = (int) temperaturaEmFahrenheit;
        System.out.println("O resultado da conversão da temperatura de Celsius para Fahrenheit é: " + resultado);


    }
}
