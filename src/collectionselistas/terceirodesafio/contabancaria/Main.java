package collectionselistas.terceirodesafio.contabancaria;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ContaBancaria contaBancaria1 = new ContaBancaria("123456", 250.00);
        ContaBancaria contaBancaria2 = new ContaBancaria("453635", 450.00);
        ContaBancaria contaBancaria3 = new ContaBancaria("968796", 780.00);

        List<ContaBancaria> contaBancarias = new ArrayList<>();
        contaBancarias.add(contaBancaria1);
        contaBancarias.add(contaBancaria2);
        contaBancarias.add(contaBancaria3);


/* Inicialmente, a variável contaMaiorSaldo é atribuída ao primeiro elemento da lista (contaBancarias.get(0)).
Um loop for percorre todas as contas na lista.
Para cada conta, verifica se o saldo da conta atual (conta.getSaldo()) é maior que o saldo da conta armazenada em contaMaiorSaldo.
Se for maior, contaMaiorSaldo é atualizado para a conta atual. */
        ContaBancaria contaMaiorSaldo = contaBancarias.get(0);
        for (ContaBancaria conta : contaBancarias) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroDaConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}
