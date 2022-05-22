public class Main {
    // Todo metódo main, tem que ser público e estático, sem retorno (main) com o nome de main e deverá receber como argumento um array de strings.
    public static void main (String[] args) {
        String cachorro = "Shesheu";
        String peixe = "Nemo";
        String gato = "Snow";

        int idadeCachorro = 2;
        int idadePeixe = 1;
        int idadeGato = 3;

        double comidaCachorro = 1.5;
        double comidaPeixe = 140;
        double comidaGato = 0.5;

        String somCachorro = "auau";
        String somPeixe = "glubglub";
        String somGato = "miau";

        System.out.println(cachorro + " tem " + idadeCachorro + " anos. " + cachorro + " come " + comidaCachorro + "kg e faz " + somCachorro);
        System.out.println(peixe + " tem " + idadePeixe + " anos. " + peixe + " come " + comidaPeixe + "g e faz " + somPeixe);
        System.out.println(gato + " tem " + idadeGato + " anos. " + gato + " come " + comidaGato + "kg (meio quilo) e faz " + somGato);

    }
}