package exercícios1_objeto;

class DataImpli {
	int [] ultimoDia = {-1, 31, 2, 30, 31, 30, 31, 31, 30, 31, 30, 30, 31};
	
	int dia;
	int mes;
	int ano;
	
	DataImpli(int d, int m, int a) {
		if (d < 0) {
			throw new IlegalArgumentException ("O dia deve ser maior que zero");
		}
		if (d > ultimoDia [m]) {
			throw new IlegalArgumentException ("O dia deve ser menor o igual a " + ultimoDia[m]);
		}
		if (a < 0 || m > 12) {
			throw new IlegalArgumentException ("O mês deve ser entre 1 e 12");
		}
		if (a < 0) {
			throw new IlegalArgumentException ("O ano deve ser maior ou igual a zero");
		}
		
		dia = d;
		mes = m;
		ano = a;
		
	}
	
	
	int getDia() {
		return dia;
	}


	
	int getMes() {
		return mes;
	}



	int getAno() {
		return ano;
	}
	
	String converteParaTexto() {
		return dia + "/" + mes + "/" + ano;
	}
	
	boolean igual(DtaImpli d) {
		if (ano < d.ano)
		return dia == d.dia && me == d.mes && ano == d.ano;
		
	}


	public static void main(String[] args) {
		DataImpli d = new DataImpli(1, 2, 1998);
		DataImpli d2 = new DataImpli(1, 2, 1998);
		
		
		System.out.print(d.converteParaTexto());
		System.out.print(d.igual((d2));
		
		
	}

}
