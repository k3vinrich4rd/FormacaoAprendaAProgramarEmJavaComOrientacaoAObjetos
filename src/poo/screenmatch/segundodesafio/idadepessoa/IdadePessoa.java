package poo.screenmatch.segundodesafio.idadepessoa;

/* Crie uma classe IdadePessoa com os atributos privados nome e idade.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.*/


public class IdadePessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void eMaiorDeIdade(int idade) {
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade");
        }else {
            System.out.println(nome + " não é maior de idade");
        }
    }
}
