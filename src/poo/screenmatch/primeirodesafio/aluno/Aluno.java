package poo.screenmatch.primeirodesafio.aluno;

/* Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
 */




public class Aluno {
    String nome;
    int idade;

    void exibirInformacoesAluno(){
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
    }
}
