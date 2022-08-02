public abstract class Vendedor {

    private String nome;

    private int pontuacao;

    public Vendedor(){

    }

    public Vendedor(String nome, int pontuacao) {
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
