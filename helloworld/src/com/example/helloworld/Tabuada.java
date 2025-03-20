package com.example.helloworld;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        exibirTabuada();
    }

    // Método para exibir a tabuada de um número
    public static void exibirTabuada() {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita o número ao usuário
            System.out.print("Digite um número para ver a tabuada: ");
            int numero = scanner.nextInt();

            // Exibe a tabuada de 1 a 10 usando um loop for
            System.out.println("Tabuada de " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                // Multiplica o número pelo índice do loop e exibe o resultado
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

        } catch (Exception e) {
            // Trata qualquer exceção que possa ocorrer durante a leitura da entrada do usuário
            System.out.println("Ocorreu um erro ao tentar ler sua entrada.");
            e.printStackTrace();  // Exibe a rastreio da pilha do erro para ajudar na depuração

        } finally {
            // Fecha o scanner
            scanner.close();
        }
    }
}

