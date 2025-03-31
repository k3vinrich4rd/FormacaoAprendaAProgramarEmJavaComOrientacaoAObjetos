package poo.screenmatch.quartodesafio.precofinal;

public class LivroTest {

    public static void main(String[] args) {
        Livro livro = new Livro();
        System.out.printf("Valor a pagar referente ao livro: " + livro.calcularPrecoFinal(40));

        System.out.println();
        ProdutoFisico produtoFisico = new ProdutoFisico();
        System.out.printf("Valor a pagar referente ao produto físico: " + produtoFisico.calcularPrecoFinal(40));
    }
}