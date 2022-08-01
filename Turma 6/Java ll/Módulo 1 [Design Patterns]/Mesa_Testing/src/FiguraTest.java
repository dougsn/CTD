import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiguraTest {

    @Test
    public void validarPerimetroQuadrado(){
        Quadrado quadrado = new Quadrado(4);
        Quadrado quadrado2 = new Quadrado(13);


        assertEquals(16,quadrado.calcularPerimetro());
        assertEquals(16,quadrado2.calcularPerimetro());
    }


}




