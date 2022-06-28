import java.util.ArrayList;
import java.util.List;

public class Armazem {

    List<Produto> produtos = new ArrayList<Produto>();

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto produto){
        produtos.add(produto);
    }

    public double calcularEspacoNecessario() {
        double espacoNecessario = 0;

        for(Produto produto: produtos){
            espacoNecessario += produto.calcularEspaco();
        }
        return espacoNecessario;
    }

}
