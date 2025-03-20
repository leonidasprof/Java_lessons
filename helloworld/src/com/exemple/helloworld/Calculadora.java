package com.exemple.helloworld;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculadora {
	
	public static void main(String[] args) {
		realizarOperacoes();
	}
	
	//Método separado para a lógica de cálculos
	public static void realizarOperacoes() {
		java.util.Scanner scanner = new Scanner(System.in);
		
		try {
			//Solicita os números ao usuário
			System.out.print("Digite o primeiro número: ");
			double numero1 = scanner.nextDouble();
			
			System.out.print("Digite o segundo número: ");
			double numero2 = scanner.nextDouble();
			
			//realza as operações
			double soma = numero1 + numero2;
			double subtracao = numero1 - numero2;
			double multiplicacao = numero1 * numero2;
			double divisao = numero1 / numero2;
			
			// Cria um formatador para exibir duas casas decimais
            DecimalFormat df = new DecimalFormat("#.##");
			
			//Exibe os resultados
			System.out.println("Soma: " + soma);
			System.out.println("Subtração: " + subtracao);
			System.out.println("Multiplicação " + multiplicacao);
			System.out.println("Divisão " + df.format(divisao));
			
		} catch (Exception e) {
			//trata qualquer exceção que possa ocorrer durante a leitura da entrada do usuário
			System.out.println("Ocorreu um erro ao tentar ler sua entrada." );
			e.printStackTrace(); //Exibe rastreio da pilha do erro para ajudar na depuração
		
		} finally {
			//Fecha o scanner
			scanner.close();
			
		}
	}

}
