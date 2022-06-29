public class Fome implements Estado {

    private Tamagochi tamagochi;

    public Fome(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

    @Override
    public void comer() {
        tamagochi.setEstado(new Feliz());
        System.out.println("Fome - come - Feliz");
    }

    @Override
    public void beber() {
        tamagochi.setEstado(new Feliz());
        System.out.println("Fome - bebe - Feliz");
    }

    @Override
    public void carinho() {
        System.out.println("Fome - Não muda");
    }
}