package AlunoTeste;

public class AlunoTestar {
	
	public static void main (String [] args) {
			
		//instanciando o objeto:
		Aluno aluno1 = new Aluno();
		
		//aluno1.nome = "Leônidas";
		
		aluno1.setNome("Leonidas");
		
		System.out.println(aluno1.getNome());
		
		//testando o private
		
		aluno1.settIdade(50);
			
	
	}
}
