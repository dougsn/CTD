

public class Circulo {


    private final int raio;

    public Circulo(int raio){
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public double calcularPerimetro(){
        return 2 * 3.14 * raio;
    }


}
