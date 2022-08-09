package Aula07_FlyweightPattern.Mesa;

public class Arvore {

    private int altura;
    private int largura;
    private String cor;

    private static int contador = 0;

    public Arvore(int altura, int largura, String cor) {
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
        contador++;
        System.out.println("Contador= " +contador);
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Arvore{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", cor='" + cor + '\'' +
                '}';
    }
}