package Aula05_ProxyPatterns;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PessoaTest {

    Date data = new Date();

    @Test
    public void vacinar1(){
        Pessoa p1 = new Pessoa("Juca","Silva","554432123",data,"Pfizer");
        Vacinar vacinar = new ServicoVacinarProxy();

        vacinar.vacinarPessoa(p1.getRg(), p1.getDataVacina(),p1.getNomeVacina());
        System.out.println(p1);


    }



}
