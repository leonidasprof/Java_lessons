package Objeto;

public class Caneta {
	
	public static void main(String[] args) {
		//instanciando a classe
		ClasseCaneta c1 = new ClasseCaneta();
		
		//acessando e modificando atributos 
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampada = false;
		c1.destampar();
		c1.rabiscar();
		c1.status();
		
	}

}
