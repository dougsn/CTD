import java.util.Scanner;

public class exNumerosPrimos {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Digite a quantidade de números primos que deseja ver: ");
        int n = scanner.nextInt();
        int contador = 0;

        for (int i = 2; contador < n; i++) {

            boolean ehPrimo = true;
            for (int x = 2; x <= i / 2; x++) {
                if (i % x == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {

                System.out.print(i + "  ");
                contador++;
            }
        }
        System.out.println("");
        System.out.println("---------------------------");
    }

}






