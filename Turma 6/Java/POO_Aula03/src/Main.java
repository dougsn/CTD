import java.util.Locale;
import java.util.Scanner;

class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("Informe o nome do cachorro:");
        String nome = scanner.next();
        System.out.println("Informe a quantidade de comida em KG:");
        int come = scanner.nextInt();

        if (come < 3) {
            System.out.println("Comida menor que 3KG");
        }  else {
            int totalPacotes = quantosPacotes(come);
            System.out.println(nome + " precisa de " + totalPacotes + " pacotes");
        }
    }

    private static int quantosPacotes(int kg) {
        int quantidadePacotes = 0;
        double somaPeso = 0;

        while (somaPeso < kg) {
            quantidadePacotes++;
            System.out.println("Informe o peso do pacote:");
            double peso = scanner.nextDouble();
            somaPeso = peso + somaPeso;
        }

        return quantidadePacotes;
    }
}