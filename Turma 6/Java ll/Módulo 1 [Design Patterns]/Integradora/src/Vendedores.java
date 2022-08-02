public abstract class Vendedores {

    private String nome;

    private int pontuacao;

    public Vendedores(){

    }

    public Vendedores(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public abstract String mostrarCategoria();

    @Override
    public String toString() {
        return "Vendedores{" +
                "nome='" + nome + '\'' +
                ", pontuacao=" + pontuacao +
                '}';
    }
}
