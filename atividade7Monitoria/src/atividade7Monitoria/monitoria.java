package atividade7Monitoria;

import java.util.ArrayList;

public class monitoria {
	private double a;
	private double b;
	private double c;
	
	public monitoria(double a, double b, double c) {
		setA(a);
		setB(b);
		setC(c);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		if (a == 0) {
			throw new IllegalArgumentException("O valor de a não pode ser igual a 0.");
		}
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double calcularFX(double x) {
		
		return (this.a * Math.pow(x, 2)) + (this.b * x) + c;
	}
	
	public ArrayList calcularRaizes() {
		ArrayList<Double> raizes = new ArrayList<Double>();
		
		double delta = Math.pow(this.b, 2) - (4 * this.a * this.c);
		
		if (delta < 0) {
			System.out.println("A função não possui raizes reais.");
			return raizes;
		} else if (delta == 0) {
			System.out.println("A função só possui uma raiz.");
			double raiz = this.b / (2 * this.a);
			raizes.add(raiz);
			return raizes;
		} else {
			double x1 = (- this.b + Math.sqrt(delta)) / (2 * this.a);
			double x2 = (- this.b + Math.sqrt(delta)) / (2 * this.a);
			
			raizes.add(x1);
			raizes.add(x2);
			
			return raizes;
		}
	}
	
	public ArrayList calcularVertices() {
		ArrayList<Double> vertices = new ArrayList<Double>();
		
		double delta = Math.pow(this.b, 2) - (4 * this.a * this.c);
		
		double xv = -this.b/ (2 * this.a);
		double yv = -delta/ (4 * this.a);
		
		vertices.add(xv);
		vertices.add(yv);
		
		return vertices;
	}
}

