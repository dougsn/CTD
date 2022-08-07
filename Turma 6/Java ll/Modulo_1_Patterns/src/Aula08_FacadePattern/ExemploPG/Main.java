package Aula08_FacadePattern.ExemploPG;

import Aula08_FacadePattern.ExemploPG.model.Cartao;
import Aula08_FacadePattern.ExemploPG.model.Endereco;
import Aula08_FacadePattern.ExemploPG.model.Produto;
import Aula08_FacadePattern.ExemploPG.service.ICompraService;
import Aula08_FacadePattern.ExemploPG.service.impl.ArmazemService;
import Aula08_FacadePattern.ExemploPG.service.impl.CompraService;
import Aula08_FacadePattern.ExemploPG.service.impl.EnvioService;
import Aula08_FacadePattern.ExemploPG.service.impl.PgtoService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Produto produtoUm = new Produto("1",5,1000,"Mouse");
        Produto produtoDois = new Produto("2",5,3000,"Teclado");
        Cartao cartao = new Cartao("1111222233334444","012","2025/07/09");

        Endereco endereco = new Endereco("Av Morumbi","1500","14280000","Morumbi","São Paulo");
        ICompraService compraService = new CompraService(new ArmazemService(Arrays.asList(produtoUm,produtoDois)),new PgtoService(),new EnvioService());

        compraService.processarCompra("1",3, cartao, endereco);
    }
}
