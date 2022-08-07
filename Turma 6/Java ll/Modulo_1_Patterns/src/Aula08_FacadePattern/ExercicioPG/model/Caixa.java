package Aula08_FacadePattern.ExercicioPG.model;

public class Caixa {

    private Double saque;

    public Caixa(Double saque) {
        this.saque = saque;
    }

    public Double getSaque() {
        return saque;
    }

    public void setSaque(Double saque) {
        this.saque = saque;
    }
}
