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


    public String mostrarCategoria() {

        if(getPontuacao() < 20){
            return "Novato";
        } else if(getPontuacao() >= 20 && getPontuacao() <= 30 ){
            return "Aprendiz";
        } else if(getPontuacao() >= 31 && getPontuacao() <= 40 ){
            return "Bom";
        } else {
            return "Mestre";
        }
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", pontuacao=" + pontuacao;
    }
}
