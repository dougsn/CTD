public class Quadrado {

    private final int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public double calcularPerimetro(){
        return 4 * lado;
    }
}
