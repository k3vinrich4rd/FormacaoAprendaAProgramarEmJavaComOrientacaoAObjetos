package poo.screenmatch.segundodesafio.idadepessoa;

public class IdadePessoaMain {
    public static void main(String[] args) {

        IdadePessoa idadePessoa = new IdadePessoa();

        idadePessoa.setNome("Kevin Richard");
        idadePessoa.setIdade(17);

        idadePessoa.eMaiorDeIdade(idadePessoa.getIdade());
    }
}
