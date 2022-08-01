import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    public void maiorDeDezoito(){



        Pessoa pessoa1 = new Pessoa("Teste",17);
        Pessoa pessoa2 = new Pessoa("Teste2",18);
        Pessoa pessoa3 = new Pessoa("Teste3",19);

        assertTrue(true,pessoa1.verificarIdade());
        assertTrue(true,pessoa2.verificarIdade());
        assertTrue(true,pessoa3.verificarIdade());

        System.out.println(pessoa1.pessoaList);
        System.out.println(pessoa2.pessoaList);
        System.out.println(pessoa3.pessoaList);
    }
}