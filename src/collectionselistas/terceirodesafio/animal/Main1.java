package collectionselistas.terceirodesafio.animal;

/* Crie uma classe Animal e uma classe Cachorro que herda de Animal.
 Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal. */


/*
 Animal animal = (Cachorro) cachorro;
Neste ponto, você está fazendo um casting explícito de um objeto do tipo Cachorro para o tipo Animal.
Isso é possível porque Cachorro é uma subclasse de Animal (ou seja, Cachorro "é um" Animal).

No entanto, o casting aqui é desnecessário, porque um objeto de uma subclasse pode ser atribuído diretamente
a uma variável de sua superclasse sem a necessidade de casting explícito. O código poderia ser simplificado para:
Animal animal = cachorro;
Isso é chamado de upcasting, e é implícito em Java.

Código:
 */
public class Main1 {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        Animal animal = (Cachorro) cachorro;
        System.out.println(animal);

    }
}
