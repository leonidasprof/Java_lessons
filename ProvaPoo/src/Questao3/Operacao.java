package Questao3;

public abstract class Operacao {
    private double valor;

    public Operacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    // Métodos abstratos não podem ter corpo
    public abstract void executar(ContaCorrente conta);
}