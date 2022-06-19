import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipe {
    private String nome;
    private List<Jogador> jogadores;

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


    public void addJogador(Objects jogador){
        List jogadores = new ArrayList<>();

        jogadores.add(jogador);

    }

    public void mostrarJogadoresTitulares(){

    }



/*    public int getQuantidadeJogadoresLesionados(){
        return ;
    }*/


}
