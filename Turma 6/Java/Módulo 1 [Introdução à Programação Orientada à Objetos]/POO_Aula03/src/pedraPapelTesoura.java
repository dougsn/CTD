import java.util.Scanner;

public class pedraPapelTesoura {

    public static void main(String[] args) {
        int ptsJogador1 = 0;
        int ptsJogador2 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do jogador 1: ");
        String nomeJogador1 = scanner.nextLine();
        System.out.println("Digite o nome do jogador 2: ");
        String nomeJogador2 = scanner.nextLine();

        boolean jogando = true;

        while (jogando) {
            System.out.println(nomeJogador1 + ", escolha uma opção: " + System.lineSeparator()
                    + "1 - Pedra;" + System.lineSeparator()
                    + "2 - Papel;" + System.lineSeparator()
                    + "3 - Tesoura;" + System.lineSeparator()
                    + "* - Sair.");
            String opcaoJogador1 = scanner.nextLine();
            System.out.println(nomeJogador2 + ", escolha uma opção: " + System.lineSeparator()
                    + "1 - Pedra;" + System.lineSeparator()
                    + "2 - Papel;" + System.lineSeparator()
                    + "3 - Tesoura;" + System.lineSeparator()
                    + "* - Sair.");
            String opcaoJogador2 = scanner.nextLine();

            if (opcaoJogador1.equals("*") || opcaoJogador2.equals("*")) {
                jogando = false;
            }

            switch (opcaoJogador1) {
                case "1":
                    if (opcaoJogador1.equals(opcaoJogador2)) {
                        System.out.println("-------------------------------" + System.lineSeparator() + "É um empate! Ninguém pontuou!" + System.lineSeparator() + "-------------------------------");
                    } else if (opcaoJogador2.equals("2")) {
                        System.out.println("-------------------------------" + System.lineSeparator() + nomeJogador2 + " ganhou!" + System.lineSeparator() + "-------------------------------");
                        ptsJogador2++;
                    } else if (opcaoJogador2.equals("3")) {
                        System.out.println("-------------------------------" + System.lineSeparator() + nomeJogador1 + " ganhou!" + System.lineSeparator() + "-------------------------------");
                        ptsJogador1++;
                    }
                    break;
                case "2":
                    if (opcaoJogador1.equals(opcaoJogador2)) {
                        System.out.println("-------------------------------" + System.lineSeparator() + "É um empate! Ninguém pontuou!" + System.lineSeparator() + "-------------------------------");
                    } else if (opcaoJogador2.equals("1")) {
                        System.out.println("-------------------------------" + System.lineSeparator() + nomeJogador1 + " ganhou!" + System.lineSeparator() + "-------------------------------");
                        ptsJogador2++;
                    } else if (opcaoJogador2.equals("3")) {
                        System.out.println("-------------------------------" + System.lineSeparator() + nomeJogador2 + " ganhou!" + System.lineSeparator() + "-------------------------------");
                        ptsJogador1++;
                    }
                    break;
                case "3":
                    if (opcaoJogador1.equals(opcaoJogador2)) {
                        System.out.println("-------------------------------" + System.lineSeparator() + "É um empate! Ninguém pontuou!" + System.lineSeparator() + "-------------------------------");
                    } else if (opcaoJogador2.equals("1")) {
                        System.out.println("-------------------------------" + System.lineSeparator() + nomeJogador2 + " ganhou!" + System.lineSeparator() + "-------------------------------");
                        ptsJogador2++;
                    } else if (opcaoJogador2.equals("2")) {
                        System.out.println("-------------------------------" + System.lineSeparator() + nomeJogador1 + " ganhou!" + System.lineSeparator() + "-------------------------------");
                        ptsJogador1++;
                    }
                    break;
                case "*":

                    System.out.println("-------------------------------");
                    System.out.println("O jogo acabou!" + System.lineSeparator());
                    System.out.println(ptsJogador1 == 1 ? nomeJogador1 + ": " + ptsJogador1 + " ponto" : nomeJogador1 + ": " + ptsJogador1 + " pontos");
                    System.out.println(ptsJogador2 == 1 ? nomeJogador2 + ": " + ptsJogador2 + " ponto" : nomeJogador2 + ": " + ptsJogador2 + " pontos");
                    System.out.println(quemGanha(ptsJogador1, ptsJogador2, nomeJogador1, nomeJogador2));
                    jogando = false;
                    break;
            }
        }
    }
    public static String quemGanha(int pontosTotaisJogador1, int PontosTotaisJogador2, String nomeJogador1, String nomeJogador2) {
        if (pontosTotaisJogador1 == PontosTotaisJogador2) {

            System.out.println("O jogo terminou empatado!");
        } else if (pontosTotaisJogador1 > PontosTotaisJogador2) {

            System.out.println(nomeJogador1 + " venceu!");
        } else {

            System.out.println(nomeJogador2 + " venceu!");
        } return "-------------------------------";
    }

}