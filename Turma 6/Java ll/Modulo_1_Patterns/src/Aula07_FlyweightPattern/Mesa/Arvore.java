package Aula07_FlyweightPattern.Mesa;

public class Arvore {
    private Double altura;
    private Double largura;
    private String cor;
    private String tipo;


    public Arvore(Double altura, Double largura, String cor, String tipo) {
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
        this.tipo = tipo;
    }


    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "[Arvore:  " +
                "altura: " + altura +
                ", largura: " + largura +
                ", cor: '" + cor + '\'' +
                ", tipo: '" + tipo +"]";
    }
}
