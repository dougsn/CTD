import java.util.Objects;

public class Jogador implements Comparable<Jogador> {
    private int numCamisa;
    private String nome;
    private boolean lesionado;
    private boolean titular;



    public Jogador(int numCamisa, String nome, boolean lesionado, boolean titular) {
        this.numCamisa = numCamisa;
        this.nome = nome;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", numCamisa: " + numCamisa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jogador)) return false; // O equals e utilizado para saber se o objeto é igual ao outro.
        Jogador jogador = (Jogador) o;
        return numCamisa == jogador.numCamisa && Objects.equals(nome, jogador.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numCamisa, nome);
    }

    // objAtual == jogador -> 0
    // objAtual > jogador -> 1        Regra para utilizar o compareTo
    // objAtual < jogador -> -1
    @Override
    public int compareTo(Jogador jogador) {
        if(numCamisa > jogador.numCamisa) return 1;
        if(numCamisa < jogador.numCamisa) return -1;
        return 0;
    }
}
