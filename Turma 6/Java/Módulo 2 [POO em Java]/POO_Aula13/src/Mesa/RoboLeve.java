package Mesa;

public class RoboLeve extends SistemaArmas implements Atacar, Defender, Voar{
    @Override
    public void mostrar() {

        System.out.println("Robo Leve se amostrando.");
    }

    @Override
    public void atacar() {
        System.out.println("Robo Leve atacado.");
    }

    @Override
    public void defender() {
        System.out.println("Robo Leve defendendo.");
    }

    @Override
    public void voar() {
        System.out.println("Robo Leve voando.");
    }
}
