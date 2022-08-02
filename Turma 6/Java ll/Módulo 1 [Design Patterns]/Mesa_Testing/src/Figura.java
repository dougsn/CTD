public class Figura {

    private double comprimento;

    public Figura(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "comprimento=" + comprimento +
                '}';
    }
}
