package com.exemple.helloworld;

import java.util.Scanner;

public class UserInfo {
	
	public static void main(String[] args) {
		greetUser();
	}
	
	public static void greetUser() {
		Scanner scanner = new Scanner(System.in);
		
		try {
		
			//Solicita  o nome do usuário
			System.out.print("Digite seu nome: ");
			String nome = scanner.nextLine();
		
			//Solicita a idade do usuário
			System.out.print("Digite sua idade: ");
			int idade = scanner.nextInt();
		
			//Exibe uma mensagem personalizada
			System.out.print("Olá, " + nome + "! Você tem " + idade + " anos.");
		
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao tentar ler sua entrada.");
			e.printStackTrace();

		} finally {
			//Fecha o scanner
			scanner.close();
		}
		
	}

}
