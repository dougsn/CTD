import java.util.*;

public class Selecao {
    private final String nome;
    private final Set<Jogador> jogadores;


    public Selecao(Set<Jogador> jogadores){
        this.nome = "Seleção Fantasma";
        this.jogadores = jogadores;
    }

    public Selecao(String nome){
        this.nome = nome;
        this.jogadores = new TreeSet<>();
    }

    public void addJogador(Jogador jogador){
        jogadores.add(jogador);
    }


//    public List<Jogador> obterReservas() throws QtdjogadorException{
//
//        if(jogadores.size() != 23){
//            throw new QtdjogadorException();
//        }
//
//        List<Jogador> reservas = new ArrayList<>();
//
//
//        return reservas;
//    }
//
//    public int quantidadeJogadores(String posicao){
//
//    };

}
