package collectionselistas.quintodesafio;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double saldo;
    private final List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public boolean lancaCompra(Compra compra) {
        if (this.saldo >= compra.getValorCompra()) {
            this.saldo -= compra.getValorCompra();
            this.compras.add(compra);
            return true;
        }
        return false;
    }
}
