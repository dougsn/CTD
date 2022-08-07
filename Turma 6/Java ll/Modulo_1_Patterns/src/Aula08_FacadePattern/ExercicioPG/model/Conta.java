package Aula08_FacadePattern.ExercicioPG.model;

public class Conta {

    private Double saldoAtual;

    public Conta(Double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }


    public Double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(Double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
}
