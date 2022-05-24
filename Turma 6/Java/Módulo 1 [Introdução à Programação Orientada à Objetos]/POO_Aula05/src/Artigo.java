public class Artigo {
    private String descricao;
    private double preco_venda;
    private int estoque;



    public Artigo(String descricao, double preco, int quantidade){
        this.descricao = descricao;
        this.preco_venda = preco;
        this.estoque = quantidade;
    }

    public int temEstoque(){
        return estoque;
    }

    public double consultarPreco(){
        return preco_venda;
    }


}
