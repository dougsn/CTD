import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private List<Jogador> jogadores = new ArrayList<>();

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public Equipe (String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void addJogador(Jogador jogador){
        jogadores.add(jogador); // Adicionando jogadores a lista de jogadores.

    }

    public void mostrarJogadoresTitulares(){

    }



/*    public int getQuantidadeJogadoresLesionados(){
        return ;
    }*/




}
