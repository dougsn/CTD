import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


//        Impressora impressoraCannon = new ImpressoraEpson("CN1020","USB", LocalDate.now(),10,100);
//        System.out.println(impressoraCannon.imprimir());

        Cachorro cachorro = new Cachorro("Bidu",2);
        System.out.println(cachorro.som());
        System.out.println(cachorro.correr());

        Cavalo cavalo = new Cavalo("Tarcisio",4);
        System.out.println(cavalo.som());
        System.out.println(cavalo.correr());

        Preguica preguica = new Preguica("Cleiton",5);
        System.out.println(preguica.som());
        System.out.println(preguica.subirEmArvore());

    }
}
