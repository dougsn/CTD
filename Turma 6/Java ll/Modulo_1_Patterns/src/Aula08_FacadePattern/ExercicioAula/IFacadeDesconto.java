package Aula08_FacadePattern.ExercicioAula;

import Aula08_FacadePattern.ExercicioAula.model.Cartao;
import Aula08_FacadePattern.ExercicioAula.model.Produto;

public interface IFacadeDesconto {

    int desconto(Cartao cartao, Produto produto, int quantidade);

}
