package poo.screenmatch.segundodesafio.contabancaria;

public class ContaBancariaMain {
    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumeroConta(3242352);
        contaBancaria.setSaldo(4000);


        System.out.println("Número da conta: " + contaBancaria.getNumeroConta());
        System.out.printf("Saldo da conta: %.2f " , contaBancaria.getSaldo());

    }
}
