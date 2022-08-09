package Aula08_FacadePattern.ExercicioAula;

import Aula08_FacadePattern.ExercicioAula.model.Cartao;
import Aula08_FacadePattern.ExercicioAula.model.Produto;
import Aula08_FacadePattern.ExercicioAula.services.FacadeDesconto;

public class Main {
    public static void main(String[] args) {

        FacadeDesconto facadeDesconto = new FacadeDesconto();

        Cartao cartao = new Cartao("44123123","Star Bank");
        Produto produto = new Produto("ervilhas","Lata");

        System.out.println("\nDesconto: " + facadeDesconto.desconto(cartao, produto, 1));

    }
}
