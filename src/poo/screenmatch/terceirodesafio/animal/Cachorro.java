package poo.screenmatch.terceirodesafio.animal;

/*
Crie uma classe Animal com um método emitirSom().
Em seguida, crie duas subclasses: Cachorro e Gato,
que herdam da classe Animal. Adicione o método emitirSom() nas subclasses,
utilizando a anotação @Override para indicar que estão sobrescrevendo o método.

Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.
 */
public class Cachorro extends Animal {

    private boolean abanar;

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }


    public void setAbanar(boolean abanar) {
        this.abanar = abanar;
    }

    @Override
    public void emitirSom() {
        System.out.println("O " + this.getNome() + " da raça " + this.getRaca() + " está latindo");

    }

    public void abanarRabo() {
        if (this.abanar) {
            System.out.println("Abanando o rabo");
        } else {
            System.out.println("Cachorro sentado");
        }
    }
}
