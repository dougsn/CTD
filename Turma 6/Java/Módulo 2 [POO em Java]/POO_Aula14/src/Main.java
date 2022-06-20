import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

//        String [] words = {"Hello","World","Hello World"};
//        words[0] = "test";
//        words[1] = "test";
//        words[2] = "test";
//
//
//
//        List<String> strings = new ArrayList<>();
//        strings.add("Francisco");
//        strings.add("Bruno");
//        strings.add("Rafael");
//        strings.remove(0);
//
//        strings.get(0);
        Jogador thiago = new Jogador(10,"Thiago",true,false);
        Jogador thiago2 = new Jogador(10,"Thiago",true,false);
        Jogador douglas = new Jogador(9,"Douglas",true,false);
        Jogador joao = new Jogador(11,"João",true,false);

//        System.out.println(joao.getNome());

        Equipe equipe = new Equipe("Mengo");

        equipe.addJogador(douglas);
        equipe.addJogador(joao);
        equipe.addJogador(thiago);
        equipe.addJogador(thiago2);

//        System.out.println(thiago2.equals(thiago));

        for (int i = 0; i < equipe.getJogadores().size(); i++){
            if(equipe.getJogadores().get(i).getNumCamisa() == 11){
                System.out.println(equipe.getJogadores().get(i));
            }
        }

        int i = 0;
        while (i < equipe.getJogadores().size()){
            if(equipe.getJogadores().get(i).getNumCamisa() == 11){
                System.out.println(equipe.getJogadores().get(i));
            }
            i++;
        }

        ListIterator<Jogador> jogInterator = equipe.getJogadores().listIterator();
        while (jogInterator.hasNext()){ // Está dizendo que no while, estara fazendo uma iteração.. Se tiver um prox item na lista (hasNext).
                System.out.println(jogInterator.next());
        }

        for (Jogador j: equipe.getJogadores()){ // forEach com Java. Instancia uma variavel de controle Jogador j, e depois o array.
            System.out.println(j);
        }



    }
}
