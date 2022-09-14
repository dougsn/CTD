package escola.Escola.service;

import escola.Escola.entity.ProfessorEntity;
import escola.Escola.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProfessorService {

    private ProfessorRepository professorRepository;

    @Autowired
    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<ProfessorEntity> buscarTodos(){
        return professorRepository.findAll();
    }

    public ProfessorEntity findProfessorByDirecao(String direcao){
        return professorRepository.findEscolaByDirecao(direcao).get();
    }


}
