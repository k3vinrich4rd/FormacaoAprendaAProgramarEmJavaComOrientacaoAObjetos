package collectionselistas.terceirodesafio.calculoarea;

/*
Crie uma interface Forma com um método calcularArea().
Implemente a interface em duas classes,
por exemplo, Circulo e Quadrado.
Em seguida, crie uma lista de formas
(objetos da interface Forma) e utilize um loop para calcular e imprimir a área de cada forma. */


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Quadrado quadrado1 = new Quadrado();
        quadrado1.calcularArea(5);
        ;
        Circulo circulo1 = new Circulo();
        circulo1.calcularArea(2);

        List<Forma> formas = new ArrayList<>();
        formas.add(quadrado1);
        formas.add(circulo1);

        for (Forma forma : formas) {
            System.out.printf("Area: %.2f %n", forma.calcularArea(5));
        }
    }


}
