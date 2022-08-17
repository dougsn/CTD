import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class FilialServiceTest {


    private FilialService filialService =  new FilialService(new FilialDaoH2(new ConfiguracaoJDBC()));


    @Test
    void cadastrarFilial() throws SQLException {

        Filial filial = new Filial("Filial Teste"," teste",26,"Cidade teste","Estado teste",true);
        Filial filial2 = new Filial("Filial Teste2","Rua teste2",22,"Cidade teste2","Estado teste2",false);
        Filial filial3 = new Filial("asd", "asd",2,"asd","asd",false);

        filialService.salvar(filial);
        filialService.salvar(filial2);
        filialService.salvar(filial3);


    }


}