package Aula08_FacadePattern.ExemploPG.service;

import Aula08_FacadePattern.ExemploPG.model.Cartao;
import Aula08_FacadePattern.ExemploPG.model.Endereco;

public interface ICompraService {

    public void processarCompra(String produtoId, Integer quantidade, Cartao cartao, Endereco endereco);
}
