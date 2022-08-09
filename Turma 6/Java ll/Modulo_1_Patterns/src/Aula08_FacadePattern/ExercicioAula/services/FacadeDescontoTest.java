package Aula08_FacadePattern.ExercicioAula.services;

import Aula08_FacadePattern.ExercicioAula.model.Cartao;
import Aula08_FacadePattern.ExercicioAula.model.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacadeDescontoTest {

    private FacadeDesconto facadeDesconto = new FacadeDesconto();
    private Cartao cartao;
    private Produto produto;

    @BeforeEach

    void doBefore(){
        cartao = new Cartao("132123","Star Bank");
        produto = new Produto("ervilhas","Lata");
    }

    @Test
    void validarDescontoBancoTest(){
        produto.setTipo("Enlatado");

        int desconto = facadeDesconto.desconto(cartao,produto,1);
        assertEquals(20,desconto);

    }

    @Test
    void validarDescontoProdutoTest(){
        cartao.setBanco("Oto Banco");

        int desconto = facadeDesconto.desconto(cartao,produto,1);
        assertEquals(10,desconto);
    }

    @Test
    void validarDescontoQuantidadeTest(){

        produto.setTipo("Enlatado");
        cartao.setBanco("Oto Banco");

        int desconto = facadeDesconto.desconto(cartao,produto,12);

        assertEquals(15,desconto);
    }

    @Test
    void validarDescontoTotalTest(){

        int desconto = facadeDesconto.desconto(cartao,produto,12);
        assertEquals(45,desconto);

    }



}
