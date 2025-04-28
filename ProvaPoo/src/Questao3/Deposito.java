package Questao3;

public class Deposito extends Operacao {
	public Deposito(double valor) {
		super(valor);
	}
	
	@Override
	public void executar(ContaCorrente conta) {
		conta.setSaldo(conta.getSaldo() + getValor());
	}
	
}
