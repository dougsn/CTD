package Aula14_PadraoDAO.test.com.dh.materias.service;

import Aula14_PadraoDAO.ExercicioPG.dao.ConfiguracaoJDBC;
import Aula14_PadraoDAO.ExercicioPG.dao.impl.MateriaDaoH2;
import Aula14_PadraoDAO.ExercicioPG.model.Materia;
import Aula14_PadraoDAO.ExercicioPG.service.MateriaService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MateriaServiceTest {

    private MateriaService materiaService = new MateriaService(new MateriaDaoH2(new ConfiguracaoJDBC()));

    @Test
     void salvarMateriaTest(){
        Materia materia = new Materia("Backend");


        Materia materiaRegistrada = materiaService.salvar(materia);

        assertTrue(materiaRegistrada.getId() != null);

    }

    @Test
    void buscarTodosTest(){
        Materia materia = new Materia("Backend");
        materiaService.salvar(materia);

        List<Materia> materiaList = materiaService.buscarTodos();

        assertEquals(1,materiaList.size());
    }

}