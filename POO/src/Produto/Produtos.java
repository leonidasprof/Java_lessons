package Produto;

public class Produtos {
	
	//atributos
	String nome;
	String marca;
	float valor;
	
	//construtores
	Produtos(){
		
	}
	
	Produtos(String nome) {
		this.nome = nome;
	}
	
	Produtos(String nome, String marca){
		this.nome =nome;
		this.marca = marca;
	}
	
	Produtos(String nome, String marca, float valor){
		this.nome =nome;
		this.marca = marca;
		this.valor = valor;
		
	}

}
