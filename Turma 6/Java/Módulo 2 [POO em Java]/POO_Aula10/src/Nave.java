import java.util.Objects;

public class Nave extends Objeto{

    private Double velocidade;
    private Integer vida;

    public Nave(Integer posx, Integer posy, Character direcao, Double velocidade) {
        super(posx, posy, direcao);
        this.velocidade = velocidade;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    @Override
    public void irA(Integer x, Integer y, Character direcao) {
        super.irA(x, y, direcao);
    }

    public Character girar(Character direcao){
        return direcao;
    }

    public Integer restaVida(Integer valor){
        return valor;
    }

    @Override
    public String toString() {
        return "Nave{" +
                "velocidade=" + velocidade +
                ", vida=" + vida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nave)) return false;
        Nave nave = (Nave) o;
        return Objects.equals(velocidade, nave.velocidade) && Objects.equals(vida, nave.vida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(velocidade, vida);
    }
}
