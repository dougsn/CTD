import java.util.Objects;

public class Asteroide extends Objeto{

    private Integer danos;

    public Asteroide(Integer posx, Integer posy, Character direcao, Integer danos) {
        super(posx, posy, direcao);
        this.danos = danos;
    }

    @Override
    public void irA(Integer x, Integer y, Character direcao) {
        super.irA(x, y, direcao);
    }

    @Override
    public String toString() {
        return "Asteroide{" +
                "danos=" + danos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Asteroide)) return false;
        Asteroide asteroide = (Asteroide) o;
        return Objects.equals(danos, asteroide.danos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(danos);
    }
}
