public class Cliente {

    private String nome;
    private Integer numero;
    private String endereco;

    public Cliente(String nome, Integer numero, String endereco) {
        this.nome = nome;
        this.numero = numero;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void fazerPedido(Pedido pedido){
        pedido = pedido;
    }

}
