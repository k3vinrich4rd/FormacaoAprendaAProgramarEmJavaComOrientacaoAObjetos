public class Formatted {
    public static void main(String[] args) {

        // %s indica que uma String
        // %f indica um valor de ponto flutuante.
        // %d indica um valor inteiro

        String tema = "Tema: Dicas para redação";

        System.out.println("""
                Anotações de estudos
                %s
                
                *Revise a gramática e ortografia.
                *Argumentos claros e objetivos
                *Cite fontes confiáveis%n""".formatted(tema) );
    }
}
