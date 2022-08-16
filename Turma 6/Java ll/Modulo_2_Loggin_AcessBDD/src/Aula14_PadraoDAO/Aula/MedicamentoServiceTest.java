package Aula14_PadraoDAO.Aula;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MedicamentoServiceTest {

    MedicamentoService medicamentoService;

    @BeforeEach
    void doBefore() {
        medicamentoService = new MedicamentoService(new MedicamentoDaoH2(new ConfiguracaoJDBC()));
    }

    @Test
    void guardarMedicamento(){
        Medicamento medicamento = new Medicamento("Ibuprofeno","Aché",395,23d);
        medicamentoService.salvar(medicamento);
        assertTrue(medicamento.getId() != null);

        Medicamento medicamento1 = new Medicamento("Dorflex","SanofiLascou",550,26.50);
        medicamentoService.salvar(medicamento1);
        assertTrue(medicamento1.getId() != null);
    }



}