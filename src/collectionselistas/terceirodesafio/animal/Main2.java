package collectionselistas.terceirodesafio.animal;

/*Modifique o Exercício 2 para incluir uma verificação usando instanceof
para garantir que o objeto seja do tipo correto antes de fazer o casting.*/

public class Main2 {
    public static void main(String[] args) {


        Animal animal =  new Cachorro();

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
        }
        else {
            System.out.println("O objeto não é um cachorro");
        }

    }
}
