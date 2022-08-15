package Aula14_PadraoDAO.ExercicioPG.service;

import Aula14_PadraoDAO.ExercicioPG.dao.IDao;
import Aula14_PadraoDAO.ExercicioPG.model.Materia;

import java.util.List;

public class MateriaService {

    private IDao<Materia> materiaIDao;

    public MateriaService(IDao<Materia> materiaIDao) {
        this.materiaIDao = materiaIDao;
    }

    public Materia salvar(Materia materia){
        return materiaIDao.salvar(materia);
    }

    public List<Materia> buscarTodos(){
        return materiaIDao.buscarTodos();
    }

}
