package poo.screenmatch.terceirodesafio.animal;

public class TestAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Ted", "Vira-Lata");
        cachorro.emitirSom();
        cachorro.setAbanar(true);
        cachorro.abanarRabo();


        Gato gato = new Gato("Negrito", "gato");
        gato.emitirSom();
        gato.setArranhar(true);
        gato.arranharMoveis();
    }
}
