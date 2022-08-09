package Aula08_FacadePattern.ExercicioAula.services;

import Aula08_FacadePattern.ExercicioAula.model.Cartao;

public class ApiCartao {

    public int desconto(Cartao cartao){
        if(cartao.getBanco().compareTo("Star Bank") == 0){ // Se retornar 0 é verdadeiro
            return 20;
        }else {
            return 0;
        }
    }

}
