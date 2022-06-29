public class Triste implements Estado {
    private Tamagochi tamagochi;

    public Triste(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

    @Override
    public void comer() {
        System.out.println("bip bip - vomitar");
    }

    @Override
    public void beber() {
        System.out.println("Triste - Não muda");
    }

    @Override
    public void carinho() {
        tamagochi.setEstado(new Feliz());
        System.out.println("Triste - Feliz");
    }
}
