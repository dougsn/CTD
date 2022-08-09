package Aula08_FacadePattern.ExercicioAula.services;

import Aula08_FacadePattern.ExercicioAula.model.Produto;

public class ApiProduto {

    public int desconto(Produto produto){
        if(produto.getTipo().compareTo("Lata") == 0){
            return 10;
        }else {
            return 0;
        }
    }
}
