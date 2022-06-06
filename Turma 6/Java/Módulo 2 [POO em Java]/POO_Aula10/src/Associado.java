public class Associado {
    private String numAssociado;
    private String nome;
    private Double valorMensal;
    private String atividade;

    public Associado(String numAssociado, String nome, Double valorMensal, String atividade) {
        this.numAssociado = numAssociado;
        this.nome = nome;
        this.valorMensal = valorMensal;
        this.atividade = atividade;
    }

    public String getNumAssociado() {
        return numAssociado;
    }

    public void setNumAssociado(String numAssociado) {
        this.numAssociado = numAssociado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(Double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public double custoMensal(){
        return this.valorMensal;
    }

    @Override
    public String toString() {
        return "numAssociado: " +numAssociado + "\n" +
                "nome : " + nome + "\n" +
                "valorMensal " + valorMensal + "\n" +
                "atividade: " + atividade;
    }
}
