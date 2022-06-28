public class Caixa extends Produto{

    private double comprimento;
    private double altura;
    private double largura;


    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public Caixa(double peso, double comprimento, double altura, double largura) {
        super(peso);
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public Caixa(double peso) {
        super(peso);
    }

    @Override
    public double calcularEspaco() {
        return getLargura() * getComprimento();
    }
}
