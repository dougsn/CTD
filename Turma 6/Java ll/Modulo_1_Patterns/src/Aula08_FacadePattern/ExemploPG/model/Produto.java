package Aula08_FacadePattern.ExemploPG.model;

public class Produto {
    private String produtoId;
    private Integer quantidade;
    private Integer valor;
    private String nome;

    public Produto(String produtoId, Integer quantidade, Integer valor, String nome) {
        this.produtoId = produtoId;
        this.quantidade = quantidade;
        this.valor = valor;
        this.nome = nome;
    }

    public String getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(String produtoId) {
        this.produtoId = produtoId;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "produtoId='" + produtoId + '\'' +
                ", quantidade=" + quantidade +
                ", valor='" + valor + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
