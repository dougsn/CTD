package Mesa;

public class Tanque extends SistemaArmas implements Atacar, Defender{
    @Override
    public void mostrar() {
        System.out.println("Tanque se amostrando.");

    }

    @Override
    public void atacar() {
        System.out.println("Tanque atacando.");
    }

    @Override
    public void defender() {
        System.out.println("Tanque defendendo.");
    }
}
