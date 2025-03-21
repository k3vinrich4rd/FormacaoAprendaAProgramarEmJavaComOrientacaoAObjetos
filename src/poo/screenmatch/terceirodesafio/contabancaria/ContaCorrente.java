package poo.screenmatch.terceirodesafio.contabancaria;

public class ContaCorrente extends ContaBancaria {

    private double tarifaMensal;

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public void
    cobrarTarifaMensal(double valorTarifa) {
        double saldoAtual = this.getSaldo();
        saldoAtual = saldoAtual - valorTarifa;
        System.out.println("Tarifa mensal de " + valorTarifa + " cobrada. Saldo atual: " + saldoAtual);
    }
}

