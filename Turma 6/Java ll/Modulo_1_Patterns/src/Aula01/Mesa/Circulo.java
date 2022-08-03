package Aula01.Mesa;

public class Circulo extends Figura {



    public Circulo(double comprimento) {
        super(comprimento);
    }



    public double calcularPerimetro(){
        return 2 * 3.14 * getComprimento();
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "comprimento=" + getComprimento() +
                ", Perimetro=" + this.calcularPerimetro() +
                '}';
    }
}
