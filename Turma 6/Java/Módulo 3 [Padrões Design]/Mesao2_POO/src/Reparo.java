public class Reparo {

    private String nome;
    private double custo ;
    private String endereco;

    private Estado estado;


    public Reparo(String nome, double custo){
        this.estado = new Orcamento(this);
        this.nome = nome;
        this.custo = custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getCusto() {
        return custo;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void proximo(){
        estado.mudarEstado();
    }

    @Override
    public String toString() {
        return "Reparo{" +
                "nome='" + nome + '\'' +
                ", custo=" + custo +
                ", endereco='" + endereco + '\'' +
                ", estado=" + estado +
                '}';
    }
}
