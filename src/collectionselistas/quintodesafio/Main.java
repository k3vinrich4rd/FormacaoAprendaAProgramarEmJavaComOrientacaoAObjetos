package collectionselistas.quintodesafio;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados do usuário
        System.out.print("Digite o limite do cartão: ");
        double limite = input.nextDouble(); // Lê o limite do cartão de crédito fornecido pelo usuário
        CartaoDeCredito cartao = new CartaoDeCredito(limite); // Cria um objeto CartaoDeCredito com o limite informado

        int sair = 1; // Variável de controle para o loop (1 para continuar, 0 para sair)
        while (sair != 0) { // Loop que continua enquanto o usuário não decidir sair
            System.out.print("Digite a descrição da compra: ");
            String descricao = input.next(); // Lê a descrição da compra

            System.out.print("Digite o valor da compra: ");
            double valor = input.nextDouble(); // Lê o valor da compra

            Compra compra = new Compra(descricao, valor); // Cria um objeto Compra com a descrição e o valor informados
            boolean compraRealizada = cartao.lancaCompra(compra); // Tenta lançar a compra no cartão de crédito

            if (compraRealizada) { // Verifica se a compra foi realizada com sucesso
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = input.nextInt(); // Lê a decisão do usuário (continuar ou sair)
            } else { // Caso a compra não seja realizada (saldo insuficiente)
                System.out.println("Saldo insuficiente!");
                sair = 0; // Sai do loop
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(cartao.getCompras()); // Ordena a lista de compras realizadas (assumindo que a classe Compra implementa Comparable)
        for (Compra c : cartao.getCompras()) { // Itera sobre a lista de compras realizadas
            System.out.println(c.getDescricaoCompra() + " - " + c.getValorCompra()); // Exibe a descrição e o valor de cada compra
        }
        System.out.println("\n***********************");

        System.out.printf("\nSaldo do cartão: %.2f", cartao.getSaldo()); // Exibe o saldo restante do cartão de crédito
    }
}

