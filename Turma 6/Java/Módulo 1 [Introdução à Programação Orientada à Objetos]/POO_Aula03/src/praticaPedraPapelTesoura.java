import java.util.Scanner;

public class praticaPedraPapelTesoura {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int ptsJogador1 = 0;
        int ptsJogador2 = 0;

        System.out.println("Primeiro jogador, digite o seu nome: ");
        String nomeJogador1 = scanner.nextLine();
        System.out.println("Segundo jogador, digite o seu nome: ");
        String nomeJogador2 = scanner.nextLine();

        boolean jogando = true;

        while (jogando){
            System.out.println( nomeJogador1 + " escolha uma das opções abaixo: " + System.lineSeparator() +
                    "1 - Pedra" + System.lineSeparator() +
                    "2 - Papel" + System.lineSeparator() +
                    "3 - Tesoura" + System.lineSeparator() +
                    "* - Sair do programa"
            );
            String escolhaJogador1 = scanner.nextLine();

            System.out.println( nomeJogador2 + " escolha uma das opções abaixo: " + System.lineSeparator() +
                    "1 - Pedra" + System.lineSeparator() +
                    "2 - Papel" + System.lineSeparator() +
                    "3 - Tesoura" + System.lineSeparator() +
                    "* - Sair do programa"
            );
            String escolhaJogador2 = scanner.nextLine();

            if (escolhaJogador1.equals("*") || escolhaJogador2.equals("*")){
                jogando = false;
            }

            switch ( escolhaJogador1 ){
                case "1":
                    if(escolhaJogador1.equals(escolhaJogador2)){
                        System.out.println("Empate");
                    } else if(escolhaJogador2.equals("2")){
                        System.out.println( nomeJogador2 + " ganhou");
                        ptsJogador2++;
                    } else if(escolhaJogador2.equals("3")){
                        System.out.println(  nomeJogador1 + " ganhou");
                        ptsJogador1++;
                    }
                    break;

                case "2":
                    if(escolhaJogador1.equals(escolhaJogador2)){
                        System.out.println("Empate");
                    } else if(escolhaJogador2.equals("1")){
                        System.out.println( nomeJogador1 + " ganhou");
                        ptsJogador1++;
                    } else if(escolhaJogador2.equals("3")){
                        System.out.println( nomeJogador2 + " ganhou");
                        ptsJogador2++;
                    }
                    break;

                case "3":
                    if(escolhaJogador1.equals(escolhaJogador2)){
                        System.out.println("Empate");
                    } else if(escolhaJogador2.equals("1")){
                        System.out.println( nomeJogador2 + " ganhou");
                        ptsJogador2++;
                    } else if(escolhaJogador2.equals("2")){
                        System.out.println( nomeJogador1 + " ganhou");
                        ptsJogador1++;
                    }
                    break;

                case "*":


                    if(ptsJogador1 > ptsJogador2){
                        System.out.println("Parabéns  " + nomeJogador1 + " você venceu  !!");
                    } else if(ptsJogador2 > ptsJogador1){
                        System.out.println("Parabéns " + nomeJogador2 + " você venceu !!");
                    } else {
                        System.out.println("Houve um empate entre os jogadores !");
                    }

                    System.out.println("Obrigado por te jogado !");

                    break;


            }


        }

    }
}
