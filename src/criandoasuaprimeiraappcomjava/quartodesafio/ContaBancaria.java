package criandoasuaprimeiraappcomjava.quartodesafio;

/*
***********************
Dados iniciais do cliente:

Nome: Jacqueline Oliveira
Tipo conta: Corrente
Saldo inicial: R$ 2500,00
***********************

Operações

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada:*/

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String clienteNome;
        String tipoConta;
        double saldoAtual;
        int opcaoMenu = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao KBank, informe os seus dados para continuar\n");

        System.out.print("Digite seu nome: ");
        clienteNome = scanner.nextLine();

        System.out.print("Digite o tipo de conta bancária: ");
        tipoConta = scanner.nextLine();

        while (!tipoConta.equalsIgnoreCase("conta corrente")) {
            System.out.println("Tipo de conta inválido, tente novamente\n");
            System.out.print("Digite o tipo de conta bancária: ");
            tipoConta = scanner.nextLine();
        }

        System.out.print("Digite seu saldo inicial: ");
        saldoAtual = scanner.nextDouble();

        String menuOperacoes = """
                ***********************
                Dados iniciais do cliente:
                Nome: %s
                Tipo de conta: %s
                Saldo inicial: R$ %.2f

                Operações:
                1- Consultar saldo
                2- Depositar valor
                3- Transferir valor
                4- Sair
                ***********************
                """.formatted(clienteNome, tipoConta, saldoAtual);

        while (opcaoMenu != 4) {
            System.out.println(menuOperacoes);
            System.out.print("Digite a opção desejada: ");
            opcaoMenu = scanner.nextInt();

            switch (opcaoMenu) {
                case 1:
                    System.out.printf("O saldo atual é: R$ %.2f%n", saldoAtual);
                    break;

                case 2:
                    System.out.print("Informe o valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    saldoAtual += valorDeposito;
                    System.out.printf("Depósito realizado com sucesso! Saldo atual: R$ %.2f%n", saldoAtual);
                    break;

                case 3:
                    System.out.print("Informe o valor a ser transferido: ");
                    double valorTransferencia = scanner.nextDouble();
                    if (saldoAtual < valorTransferencia) {
                        System.out.println("Transferência não realizada. Saldo insuficiente.");
                    } else {
                        saldoAtual -= valorTransferencia;
                        System.out.printf("Transferência realizada com sucesso! Saldo atual: R$ %.2f%n", saldoAtual);
                    }
                    break;

                case 4:
                    System.out.printf("Saindo, volte sempre %s!%n", clienteNome);
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }

        scanner.close();
    }
}




