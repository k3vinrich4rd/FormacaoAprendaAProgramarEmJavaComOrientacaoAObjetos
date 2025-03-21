package poo.screenmatch.terceirodesafio.animal;
/*
Crie uma classe Animal com um método emitirSom().
Em seguida, crie duas subclasses: Cachorro e Gato,
que herdam da classe Animal. Adicione o método emitirSom() nas subclasses,
utilizando a anotação @Override para indicar que estão sobrescrevendo o método.

Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.
 */
public class Gato extends Animal {

    private boolean arranhar;

    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    public boolean isArranhar() {
        return arranhar;
    }

    public void setArranhar(boolean arranhar) {
        this.arranhar = arranhar;
    }

    @Override
    public void emitirSom() {
        System.out.println("O " + this.getNome() + " da raça " + this.getRaca() + " está miando");

    }

    public void arranharMoveis() {
        if (this.arranhar) {
            System.out.println("Arranhando");
        } else {
            System.out.println("O Gato esta dormindo");
        }
    }
}
