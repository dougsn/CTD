
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] nomes = new String[5];

        nomes[0] = "Juan";
        nomes[1] = "Mario";
        nomes[2] = "Carlos";

        /*acessar um elemento por seu índice*/
        System.out.println(nomes[0]);

        /*descomente e veja o que acontece acessando uma posição fora de alcance*/
        //System.out.println(nomes[7]);

        /*percorrer um array com um for*/
        for(int i = 0; i<nomes.length; i++)
            System.out.println(nomes[i]);

        /*percorrer um array com um while*/
        int i = 0;
        while(i < nomes.length) {
            System.out.println(nomes[i]);
            i++;
        }

        /*percorrer um array com um for each*/
        for(String nombre : nomes)
            System.out.println(nombre);


    }
}