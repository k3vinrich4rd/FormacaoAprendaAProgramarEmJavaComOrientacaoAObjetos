package criandoasuaprimeiraappcomjava.quartodesafio.v2;

import java.util.Scanner;

public class ContaBancaria {

    static class ExibirSaldo implements Operacao {

        @Override
        public double executar(double saldoAtual, Scanner input, String nomeCliente) {
            System.out.printf("O saldo atual é: R$ %.2f", saldoAtual);
            System.out.println();
            return saldoAtual;
        }
    }

    static class Depositar implements Operacao {

        @Override
        public double executar(double saldoAtual, Scanner input, String nomeCliente) {
            System.out.print("Informe o valor a depositar: ");
            double valorDeposito = input.nextDouble();
            saldoAtual += valorDeposito;
            System.out.printf("Depósito realizado com sucesso! Saldo atual: R$ %.2f%n", saldoAtual);
            return saldoAtual;
        }
    }

    static class Transferir implements Operacao {
        @Override
        public double executar(double saldoAtual, Scanner input, String clienteNome) {
            System.out.print("Informe o valor a ser transferido: ");
            double valorTransferencia = input.nextDouble();
            if (saldoAtual < valorTransferencia) {
                System.out.println("Transferência não realizada. Saldo insuficiente.");
            } else {
                saldoAtual -= valorTransferencia;
                System.out.printf("Transferência realizada com sucesso! Saldo atual: R$ %.2f%n ", saldoAtual);
            }
            return saldoAtual;
        }
    }

    // Implementação para sair
    static class Sair implements Operacao {
        @Override
        public double executar(double saldoAtual, Scanner input, String clienteNome) {
            System.out.printf("Saindo, volte sempre %s!%n", clienteNome);
            return saldoAtual;
        }
    }

    // Implementação para opção inválida
    static class OpcaoInvalida implements Operacao {
        @Override
        public double executar(double saldoAtual, Scanner input, String clienteNome) {
            System.out.println("Opção inválida, tente novamente.");
            return saldoAtual;
        }
    }


    // Método para exibir o menu
    public static void exibirMenu() {

        System.out.println("Menu:");
        System.out.println("1 - Exibir Saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Transferir");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static String verificaConta(String tipoConta, Scanner scanner) {
        while (!tipoConta.equalsIgnoreCase("conta corrente")) {
            System.out.println("Tipo de conta inválido, tente novamente\n");
            System.out.print("Digite o tipo de conta bancária: ");
            tipoConta = scanner.nextLine();
        }
        return tipoConta;
    }

    public static String menuClient(String clienteNome, String contaVerificada, double saldoAtual) {
        return """
                
                ***********************
                Dados iniciais do cliente:
                Nome: %s
                Tipo de conta: %s
                Saldo inicial: R$ %.2f
                ***********************
                """.formatted(clienteNome, contaVerificada, saldoAtual);

    }


}
