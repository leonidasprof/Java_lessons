package Objeto;

public class ClasseCaneta {
	//5atributos
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga:" + this.carga );
		System.out.println("Está tampada? " + this.tampada);
	}
	
	//3métodos
	void status() {
		
	}
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Não posso rabistar. A caneta está tampada!");
		} else {
			System.out.println("Estou rabiscando!");
		}
		
	}
	void tampar() {
		this.tampada = true;
	}
	void destampar() {
		this.tampada = false;
	}
}
