package poo.screenmatch.segundodesafio.livro;


/*
Desenvolva uma classe Livro com os atributos privados titulo e autor.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método exibirDetalhes que imprime o título e o autor do livro.
 */

public class Livro {

    private String titulo;
    private String autor;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirInformacoes() {
        System.out.println("Titulo do livro: " + this.titulo);
        System.out.println("Autor do livro: " + this.autor);
    }
}
