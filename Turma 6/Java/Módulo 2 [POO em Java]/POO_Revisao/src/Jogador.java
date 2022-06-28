
public class Jogador implements Comparable<Jogador>{
    // Se utiliza o final, quando a variavel não muda, ela é fixa.

    private final String nome;
    private final int numCamisa;
    private String posicao;
    private Escalacao escalacao ;

    public Jogador(String nome, int numCamisa, String posicao, Escalacao escalacao) {
        this.nome = nome;
        this.numCamisa = numCamisa;
        this.posicao = posicao;
        this.escalacao = escalacao;
    }

    public String getNome() {
        return nome;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Escalacao getEscalacao() {
        return escalacao;
    }

    public void setEscalacao(Escalacao escalacao) {
        this.escalacao = escalacao;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", numCamisa=" + numCamisa +
                ", posicao='" + posicao + '\'' +
                ", escalacao=" + escalacao +
                '}';
    }

    @Override
    public int compareTo( Jogador jogador) {
        // obj atual (this) for maior, é 1;
        // obj atual (this) for menor, é -1;

        if(this.numCamisa > jogador.numCamisa) {
            return 1;
        } else if (this.numCamisa < jogador.numCamisa) {
            return -1;
        } else {
            return 0;
        }


    }


}
