package atividade7Monitoria;

public class MainFuncaoQuadratica {

	public static void main(String[] args) {
		monitoria funcao = new monitoria(1, 4, 1);
		
		System.out.println(funcao.getA() + " " + funcao.getB() + " " + funcao.getB());
		System.out.println(funcao.calcularFX(2));
		System.out.println("As raizes da função são: " + funcao.calcularRaizes());
		System.out.println("O vertices da função são: " + funcao.calcularVertices());
			
	}

}
