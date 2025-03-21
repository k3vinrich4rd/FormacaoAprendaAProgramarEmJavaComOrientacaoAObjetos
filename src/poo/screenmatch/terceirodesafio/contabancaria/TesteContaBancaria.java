package poo.screenmatch.terceirodesafio.contabancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();

        contaCorrente.cobrarTarifaMensal(10);















    }
}
