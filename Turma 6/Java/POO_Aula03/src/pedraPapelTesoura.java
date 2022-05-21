import java.util.Scanner;

public class pedraPapelTesoura {

    public static void main(String[] args) {

        int ptsJogador1 = 0;
        int ptsJogador2 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do jogador 1: ");
        String nomeJogador1 = scanner.next();
        System.out.println("Digite o nome do jogador 2: ");
        String nomeJogador2 = scanner.next();

        boolean jogando = true;

        while(jogando){

            System.out.println(nomeJogador1 + ", escolha uma opção: " + System.lineSeparator()
                    + "1 - Pedra;" + System.lineSeparator()
                    + "2 - Papel;" + System.lineSeparator()
                    + "3 - Tesoura;" + System.lineSeparator()
                    + "* - Sair.");
            String opcaoJogador1 = scanner.next();
            System.out.println(nomeJogador2 + ", escolha uma opção: " + System.lineSeparator()
                    + "1 - Pedra;" + System.lineSeparator()
                    + "2 - Papel;" + System.lineSeparator()
                    + "3 - Tesoura;" + System.lineSeparator()
                    + "* - Sair.");
            String opcaoJogador2 = scanner.next();

            if(opcaoJogador1.equals("*") || opcaoJogador2.equals("*")){
                jogando = false;
            }

            switch (opcaoJogador1){
                case "1":
                    if(opcaoJogador1.equals(opcaoJogador2)){
                        System.out.println("-------------------------------" + System.lineSeparator() + "É um empate! Ninguém pontuou!" +  System.lineSeparator() + "-------------------------------");
                    } else if(opcaoJogador2.equals("2")){
                        System.out.println("-------------------------------" + System.lineSeparator() + nomeJogador2 + " ganhou!" +  System.lineSeparator() + "-------------------------------");
                        ptsJogador2++;
                    }  else if(opcaoJogador2.equals("3")){
                        System.out.println("-------------------------------" + System.lineSeparator() + nomeJogador1 + " ganhou!" +  System.lineSeparator() + "-------------------------------");
                        ptsJogador1++;
                    }

                case "2":
                    if(opcaoJogador1.equals(opcaoJogador2)){
                        System.out.println("-------------------------------" + System.lineSeparator() + "É um empate! Ninguém pontuou!" +  System.lineSeparator() + "-------------------------------");
                    } else if(opcaoJogador2.equals("1")){
                        System.out.println("-------------------------------" + System.lineSeparator() + nomeJogador2 + " ganhou!" +  System.lineSeparator() + "-------------------------------");
                        ptsJogador2++;
                    } else  if(opcaoJogador2.equals("3")){
                        System.out.println("-------------------------------" + System.lineSeparator() + nomeJogador1 + " ganhou!" +  System.lineSeparator() + "-------------------------------");
                        ptsJogador1++;
                    }

                case "3":
                    if(opcaoJogador1.equals(opcaoJogador2)){
                        System.out.println("-------------------------------" + System.lineSeparator() + "É um empate! Ninguém pontuou!" +  System.lineSeparator() + "-------------------------------");
                    }

            }

        }


    }


}
