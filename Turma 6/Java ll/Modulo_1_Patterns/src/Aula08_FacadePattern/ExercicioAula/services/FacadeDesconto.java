package Aula08_FacadePattern.ExercicioAula.services;

import Aula08_FacadePattern.ExercicioAula.IFacadeDesconto;
import Aula08_FacadePattern.ExercicioAula.model.Cartao;
import Aula08_FacadePattern.ExercicioAula.model.Produto;

public class FacadeDesconto implements IFacadeDesconto {

    // O Facade armazenam as variáveis de uma instância de cada uma.

    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    // Construtor que cria as instâncias

    public FacadeDesconto(){
        apiCartao = new ApiCartao();
        apiProduto = new ApiProduto();
        apiQuantidade = new ApiQuantidade();
    }

    @Override
    public int desconto(Cartao cartao, Produto produto, int quantidade){
        int desconto = 0;

        desconto = desconto + apiQuantidade.desconto(quantidade);
        desconto = desconto + apiProduto.desconto(produto);
        desconto = desconto + apiCartao.desconto(cartao);

        return desconto;
    }

}
