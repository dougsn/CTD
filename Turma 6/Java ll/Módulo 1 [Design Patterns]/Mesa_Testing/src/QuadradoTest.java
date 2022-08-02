import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {
    @Test
    public void validarPerimetroQuadrado(){
        Quadrado quadrado = new Quadrado(4);
        Quadrado quadrado2 = new Quadrado(13);
        assertEquals(16,quadrado.calcularPerimetro());
        assertEquals(52,quadrado2.calcularPerimetro());
        System.out.println(quadrado);
        System.out.println(quadrado2);
    }

}