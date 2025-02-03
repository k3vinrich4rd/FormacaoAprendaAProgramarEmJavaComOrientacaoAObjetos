public class Filme {
    public static void main(String[] args) {

        System.out.println("Esse é screen match");
        System.out.println("Filme: Top Gun Maverick ");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean estaNoPlano = true;
        double notaDoFilme = 8.1;
        System.out.println("Nota do filme: " + notaDoFilme);


        double media = notaDoFilme + 15.3;
        System.out.printf("%.2f", media);
    }
}
