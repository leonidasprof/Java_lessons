package com.example.helloworld;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalcularMedia {

    public static void main(String[] args) {
        calcularMediaNotas();
    }

    // Método para calcular a média das notas
    public static void calcularMediaNotas() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Usar Locale.US para ponto decimal

        try {
            // Solicita o número de notas ao usuário
            System.out.print("Digite o número de notas: ");
            int numeroDeNotas = scanner.nextInt();
            
            // Cria um formatador para exibir duas casas decimais
            DecimalFormat df = new DecimalFormat("#.##");

            // Cria um array para armazenar as notas
            double[] notas = new double[numeroDeNotas];

            // Solicita as notas ao usuário
            for (int i = 0; i < numeroDeNotas; i++) {
                System.out.print("Digite a nota " + (i + 1) + ": ");
                notas[i] = scanner.nextDouble();  // Usar nextDouble para números decimais
            }

            // Calcula a soma das notas
            double soma = 0;
            for (int i = 0; i < numeroDeNotas; i++) {
                soma += notas[i];
            }

            // Calcula e exibe a média
            double media = soma / numeroDeNotas;
            System.out.println("A média das notas é: " + df.format(media));

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

