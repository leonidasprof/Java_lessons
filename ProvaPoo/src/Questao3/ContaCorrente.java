package Questao3;

import java.util.Scanner;

public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

    public void realizarOperacao(Operacao operacao) {
        operacao.executar(this);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente(1000);

        // Exibir saldo atual
        System.out.println("Seu saldo atual é R$: " + conta.getSaldo());

        System.out.println("Deseja fazer um saque? (sim/não)");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.print("Digite o valor do saque: ");
            double valorSaque = scanner.nextDouble();

            Operacao saque = new Saque(valorSaque);
            conta.realizarOperacao(saque);

            System.out.println("Seu saldo atual é R$: " + conta.getSaldo());
        } else {
            System.out.println("Operação encerrada. Saldo em conta: " + conta.getSaldo());
        }

        scanner.close();
    }
}