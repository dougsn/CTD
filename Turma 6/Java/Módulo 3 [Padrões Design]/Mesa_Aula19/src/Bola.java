public class Bola extends Produto{

    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public Bola(double peso, double raio) {
        super(peso);
        this.raio = raio;
    }

    @Override
    public double calcularEspaco() {
        return  Math.pow(getRaio(),2)*3.14;
    }
}
