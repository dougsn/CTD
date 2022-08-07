package Aula08_FacadePattern.ExemploPG.service.impl;

import Aula08_FacadePattern.ExemploPG.model.Cartao;
import Aula08_FacadePattern.ExemploPG.model.Endereco;
import Aula08_FacadePattern.ExemploPG.model.Produto;
import Aula08_FacadePattern.ExemploPG.service.ICompraService;

import java.util.List;

public class CompraService implements ICompraService {
    private ArmazemService armazemService;
    private PgtoService pgtoService;
    private EnvioService envioService;

    public CompraService(ArmazemService armazemService, PgtoService pgtoService, EnvioService envioService) {
        this.armazemService = armazemService;
        this.pgtoService = pgtoService;
        this.envioService = envioService;
    }

    @Override
    public void processarCompra(String produtoId, Integer quantidade, Cartao cartao, Endereco endereco) {
        Produto produto = armazemService.buscarProduto(produtoId,quantidade);
        if(produto != null){
            //Se temos o produto, processamos o pagamento
            if(pgtoService.processarPgto(cartao,String.valueOf(produto.getValor() * quantidade))){
                envioService.processarEnvio(List.of(produto), endereco);
            }

        }
    }
}
