package poo.screenmatch.terceirodesafio.animal;
/*
Crie uma classe Animal com um método emitirSom().
Em seguida, crie duas subclasses: Cachorro e Gato,
que herdam da classe Animal. Adicione o método emitirSom() nas subclasses,
utilizando a anotação @Override para indicar que estão sobrescrevendo o método.

Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.
 */
public class Animal {

    private String nome;
    private String raca;


    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void emitirSom(){
        System.out.println("Emitindo um som");

    }
}
