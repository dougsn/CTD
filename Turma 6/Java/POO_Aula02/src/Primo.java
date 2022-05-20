import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um valor: ");

        int valor = scanner.nextInt();

        if(valor >= 2 && ehPrimo(valor)){
            System.out.println("É primo !");
        } else {
            System.out.println("Não é primo !");
        }

    }

    // Criando uma função e utilizando ela acima.
    private static boolean ehPrimo(int valor) {

        boolean primo = true;

        for (int i = 2; i<valor; i++){
            if (valor % i == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }

}
