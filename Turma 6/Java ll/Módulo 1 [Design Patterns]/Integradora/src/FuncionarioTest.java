import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    Funcionario f1,f2;
    Afiliado a1, a2;

    @BeforeEach
    void criarFuncionarios(){
        f1 = new Funcionario("Eventor",5);
        f2 = new Funcionario("Douglas",2);
        a1 = new Afiliado("Lucas",2);
        a2 = new Afiliado("Ruggiero",3);
    }

    @Test
    void testarFunc(){
        f1.setAntiguidade(LocalDate.of(2022,5,1));
        f2.setAntiguidade(LocalDate.of(2017,9,11));


        f1.obterAfiliados(a1);
        f1.obterAfiliados(a2);
        f2.obterAfiliados(a2);

        f1.calculaAntiguidade();
        f2.calculaAntiguidade();


        f1.vender();

        f2.vender();
        f2.vender();

        f1.mostrarCategoria();
        f2.mostrarCategoria();

        System.out.println(f1.toString());
        System.out.println(f2.toString());


    }

}