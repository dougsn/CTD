public abstract class Produto {
    private double peso;

    public Produto(double peso){
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public abstract double calcularEspaco();




}
