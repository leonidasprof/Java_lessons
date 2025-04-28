package Questao3;

public class Saque extends Operacao {
	public Saque(double valor) {
		super(valor);
	}
	
	@Override
	public void executar(ContaCorrente conta) {
		if (conta.getSaldo() >= getValor()) {
			conta.setSaldo(conta.getSaldo() - getValor());
		} else {
			System.out.println("Saldo insuficiente para saque.");
		}
	}
	

}
