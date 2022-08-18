import Aula18_Maven.Paciente.*;
import org.junit.jupiter.api.Test;

class PacienteServiceTest {


    private PacienteService pacienteService = new PacienteService(new PacienteDaoH2(new ConfiguracaoJDBC()));



    @Test
    void cadastrarPaciente(){

        Endereco endereco = new Endereco("Rua teste",12,"Cidade teste","Bairro teste");

        Paciente paciente = new Paciente("Douglas","Silva","24.565.212-01", "2022/08/16");

        pacienteService.cadastrar(paciente);
        pacienteService.buscar(paciente.getId());

    }


}