public class Sede implements Estado {
    private Tamagochi tamagochi;

    public Sede(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

    @Override
    public void comer() {
        System.out.println("Sede - Não muda");
    }

    @Override
    public void beber() {
        tamagochi.setEstado(new Feliz());
        System.out.println("Sede - Feliz");
    }

    @Override
    public void carinho() {
        System.out.println("Sede - Não muda");
    }
}
