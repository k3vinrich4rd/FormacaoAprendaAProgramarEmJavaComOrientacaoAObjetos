package poo.screenmatch.segundodesafio.aluno;

public class AlunoMain {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNota1(7.8);
        aluno.setNota2(5.8);
        aluno.setNota3(10);

        aluno.calcularMedia(aluno.getNota1(), aluno.getNota2(), aluno.getNota3());

    }
}
