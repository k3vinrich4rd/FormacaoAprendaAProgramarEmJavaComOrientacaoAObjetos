package poo.screenmatch.quartodesafio.calculadorasalaretangular;

public class CalculadoraSalaRetangularTest {

    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
        calculadoraSalaRetangular.setAltura(40);
        calculadoraSalaRetangular.setLargura(5);

        System.out.println("Área da sala retangular é: " + calculadoraSalaRetangular.calcularArea
                (calculadoraSalaRetangular.getAltura(), calculadoraSalaRetangular.getLargura()));

        System.out.println("O perímetro da sala retangular é: " + calculadoraSalaRetangular.calcularPerimetro
                (calculadoraSalaRetangular.getAltura(), calculadoraSalaRetangular.getLargura()));

    }


}
