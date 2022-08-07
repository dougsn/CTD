package Aula08_FacadePattern.ExemploPG.service.impl;

import Aula08_FacadePattern.ExemploPG.model.Endereco;
import Aula08_FacadePattern.ExemploPG.model.Produto;

import java.util.List;

public class EnvioService {
    public void processarEnvio(List<Produto> produtos, Endereco endereco){
        System.out.println("Enviando produtos a " + endereco.getRua() +" "+ endereco.getNro() +","+ endereco.getBairro());
    }
}
