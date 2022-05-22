import java.util.Scanner;

public class ex2Variaveis {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        escolhaUsuario(num1, num2, num3);


    }

    private static void escolhaUsuario(int escolha1, int escolha2, int escolha3){


        if(escolha1 > escolha2 && escolha1 > escolha3){

            System.out.println( "O maior número é: " + escolha1);
        } else if(escolha2 > escolha1 && escolha2 > escolha3){

            System.out.println( "O maior número é: " + escolha2);
        } else if(escolha3 > escolha1 && escolha3 > escolha2) {

            System.out.println( "O maior número é: " + escolha3);
        }


    }


}
