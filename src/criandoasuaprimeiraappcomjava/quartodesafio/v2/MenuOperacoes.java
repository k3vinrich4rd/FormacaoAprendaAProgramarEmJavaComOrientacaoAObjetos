package criandoasuaprimeiraappcomjava.quartodesafio.v2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static criandoasuaprimeiraappcomjava.quartodesafio.v2.ContaBancaria.*;

public class MenuOperacoes {
    // Classe principal

    public static void main(String[] args) {

        String clienteNome;
        String tipoConta;
        double saldoAtual;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        clienteNome = scanner.nextLine();

        System.out.print("Digite o tipo de conta bancária: ");
        tipoConta = scanner.nextLine();

        String contaVerificada = verificaConta(tipoConta, scanner);

        System.out.print("Digite seu saldo inicial: ");
        saldoAtual = scanner.nextDouble();

        while (saldoAtual < 0) {
            System.out.print("""
        
                    Impossível iniciar essa ação com um saldo negativo
                    digite novamente:\s""");
            saldoAtual = scanner.nextDouble();
        }

        String menuCliente = menuClient(clienteNome, contaVerificada, saldoAtual);

        System.out.println(menuCliente);

        // Mapeamento de opções para estratégias
        Map<Integer, Operacao> operacoes = new HashMap<>();
        operacoes.put(1, new ContaBancaria.ExibirSaldo());
        operacoes.put(2, new ContaBancaria.Depositar());
        operacoes.put(3, new ContaBancaria.Transferir());
        operacoes.put(4, new ContaBancaria.Sair());

        int opcaoMenu;
        do {
            exibirMenu();
            opcaoMenu = scanner.nextInt();

            // Obtém a operação correspondente ou uma operação padrão para opções inválidas
            Operacao operacao = operacoes.getOrDefault(opcaoMenu, new ContaBancaria.OpcaoInvalida());
            saldoAtual = operacao.executar(saldoAtual, scanner, clienteNome);
        } while (opcaoMenu != 4);

        scanner.close();
    }


}

