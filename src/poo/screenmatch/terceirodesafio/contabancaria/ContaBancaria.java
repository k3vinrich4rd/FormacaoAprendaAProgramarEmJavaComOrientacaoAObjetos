package poo.screenmatch.terceirodesafio.contabancaria;
/*
Crie uma classe ContaBancaria com métodos para realizar operações bancárias como
depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente
que herda da classe ContaBancaria. Adicione um método específico para a subclasse,
como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente. */


import poo.screenmatch.terceirodesafio.contabancaria.exception.SaldoInsuficienteException;

public class ContaBancaria {

    public ContaBancaria() {
    }

    public ContaBancaria(String titularDaConta, double saldo, String numeroDaConta) {
        this.titularDaConta = titularDaConta;
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
    }

    private String titularDaConta;
    private double saldo;
    private String numeroDaConta;

    public String getTitularDaConta() {
        return this.titularDaConta;
    }

    public void setTitularDaConta(String titularDaConta) {
        this.titularDaConta = titularDaConta;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo é: " + this.getSaldo());
    }

    public void depositar(double quantiaDepositada) {
        this.saldo += quantiaDepositada;

    }

    public void sacar(double quantiaASacar) {
        if (this.saldo < quantiaASacar || this.saldo == 0) {
            throw new SaldoInsuficienteException("Impossível efetuar o saque, saldo insuficiente");
        }
        this.saldo -= quantiaASacar;
    }

}
