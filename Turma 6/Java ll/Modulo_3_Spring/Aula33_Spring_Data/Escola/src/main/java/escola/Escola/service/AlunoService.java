package escola.Escola.service;

import escola.Escola.entity.AlunoEntity;
import escola.Escola.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AlunoService {

    private AlunoRepository alunoRepository;

    @Autowired
    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<AlunoEntity> bucarTodos(){
        return alunoRepository.findAll();
    }

    public AlunoEntity findAlunoByName(String nome){
        return alunoRepository.findAlunoByName(nome).get();
    }


}
