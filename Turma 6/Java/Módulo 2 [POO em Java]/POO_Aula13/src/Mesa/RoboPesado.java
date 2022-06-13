package Mesa;

public class RoboPesado extends SistemaArmas implements Atacar, Defender, Voar{
    @Override
    public void mostrar() {
        System.out.println("Robo Pesado se amostrado.");
    }

    @Override
    public void atacar() {
        System.out.println("Robo Pesado atacando.");
    }

    @Override
    public void defender() {
        System.out.println("Robo Pesado defendendo.");
    }

    @Override
    public void voar() {
        System.out.println("Robo Pesado voando.");
    }
}
