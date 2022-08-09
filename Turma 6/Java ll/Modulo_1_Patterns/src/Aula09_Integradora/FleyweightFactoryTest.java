package Aula09_Integradora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FleyweightFactoryTest {

    @Test
    void getTrianguloComTamanho(){

        Triangulo triangulo = FleyweightFactory.obterTriangulo("vermelho");
        triangulo.setTamanho(2);

        Triangulo triangulo2 = FleyweightFactory.obterTriangulo("vermelho");
        triangulo2.setTamanho(4);

        assertEquals(triangulo.getCor(),"vermelho");
        assertEquals(triangulo2.getTamanho(),4);
        assertEquals(FleyweightFactory.trianguloMap.size() == 1, true);


    }


}