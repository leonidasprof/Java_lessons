package Estudando;

public class Aula02 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Esferográfica";
		c1.cor = "azul";
		c1.ponta = 0.5f;
		c1.tampada = false;
		c1.status();
		
		
		Caneta c2 = new Caneta();
		c2.modelo = "Bicolor";
		c2.cor = "Azul e Vermelho";
		c2.ponta = 0.5f;
		c2.tampada = true;
		c2.status();
		

	}

}
