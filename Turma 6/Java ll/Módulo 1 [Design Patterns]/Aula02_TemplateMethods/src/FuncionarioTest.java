import org.junit.jupiter.api.Test;

class FuncionarioTest {

    @Test
    void Calculos(){
        Funcionario funcionario = new Efetivo("Lucas","Ferreira","1234567890",10000.00,1.0,5000.00);
        funcionario.pagamentoSalario();

        Funcionario funcionario2 = new Contratado("Issao","Takeuchi","1234567891",1000.00,40);
        funcionario2.pagamentoSalario();
    }

}