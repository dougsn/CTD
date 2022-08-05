package Aula07_FlyweightPattern;

public class Circulo {
    private final String cor;

    private double raio;
    private String tamanho;

    public Circulo(String cor) {
        this.cor = cor;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void desenhar(){
        System.out.println("Desenhamos um objeto de cor: " + cor);
    }
}
