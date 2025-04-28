package Estudando;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.print("Situação: ");
		situacao();
		System.out.println("Está em uso?");
		rabiscar();
		System.out.println("");
	}
	
	public void rabiscar() {
		if (this.tampada == false && this.modelo == null) {
			System.out.print("Não.");
		} else if (this.tampada == true) {
			System.out.print("Sim.");
		} else {
			System.out.print("Não.");
		}
	}
	
	protected void situacao() {
		if (this.modelo == null) {
			System.out.println("Não existe caneta!"); 
		} else if (this.tampada == false || this.cor == null){
			System.out.println("Tampada");
		} else {
			System.out.println("Destampada");
		}
	}
}
