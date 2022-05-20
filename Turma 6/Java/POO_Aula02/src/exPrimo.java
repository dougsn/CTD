import java.util.Scanner;

public class exPrimo {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite um valor: ");
        int numero = scanner.nextInt();

        if(numero > 2 && ePrimo(numero)){
            System.out.println("É primo !");
        } else {
            System.out.println("Não é primo !");
        }

    }

    private static boolean ePrimo(int valor) {

        boolean primo = true;

        for (int i = 2; i<valor; i++){
            if(valor % i == 0){
                primo = false;
                break;
            }
        }
        return primo;
    }

}
