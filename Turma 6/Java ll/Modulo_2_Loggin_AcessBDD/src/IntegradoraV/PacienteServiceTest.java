package IntegradoraV;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PacienteServiceTest {


    private PacienteService pacienteService = new PacienteService(new PacienteDaoH2(new ConfiguracaoJDBC()));



    @Test
    void cadastrarPaciente(){

        Endereco endereco = new Endereco("Rua teste",12,"Cidade teste","Bairro teste");

        Paciente paciente = new Paciente("Douglas","Silva","24.565.212-01", "2022/08/16",endereco);

        pacienteService.cadastrar(paciente);
        pacienteService.buscar(paciente.getId());

    }


}