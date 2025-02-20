package collectionselistas.quintodesafio;

public class Compra implements Comparable<Compra> {
    private final String descricaoCompra;
    double valorCompra;

    public Compra(String descricaoCompra, double valorCompra) {
        this.descricaoCompra = descricaoCompra;
        this.valorCompra = valorCompra;
    }

    public String getDescricaoCompra() {
        return descricaoCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "Compra: descrição = " + descricaoCompra + '\'' +
                ", valorCompra=" + valorCompra +
                '}';
    }

    @Override
    public int compareTo(Compra outraCompra) {
        //Forma que a professora fez:
        //return Double.valueOf(this.valorCompra).compareTo(Double.valueOf(outraCompra.valorCompra));
        return Double.compare(this.valorCompra, outraCompra.valorCompra);
    }
}