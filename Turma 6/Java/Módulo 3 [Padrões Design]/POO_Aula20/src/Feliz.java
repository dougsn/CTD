public class Feliz implements Estado {
    @Override
    public void comer() {
        // Não muda
        System.out.println("Feliz - Não muda");
    }

    @Override
    public void beber() {
        System.out.println("bip bip bip bip bip");
    }

    @Override
    public void carinho() {
        System.out.println("bip bip");
    }
}