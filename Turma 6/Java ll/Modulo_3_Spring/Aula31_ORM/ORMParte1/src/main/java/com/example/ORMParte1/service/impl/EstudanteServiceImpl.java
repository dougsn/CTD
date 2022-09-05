package com.example.ORMParte1.service.impl;

import com.example.ORMParte1.entity.EstudantesEntity;
import com.example.ORMParte1.repository.IEstudanteRepository;
import com.example.ORMParte1.service.IEstudanteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteServiceImpl implements IEstudanteService<EstudantesEntity> {

    private final IEstudanteRepository estudanteRepository;

    public EstudanteServiceImpl(IEstudanteRepository estudanteRepository) {
        this.estudanteRepository = estudanteRepository;
    }


    @Override
    public List<EstudantesEntity> findAllEstudantes() {
        return estudanteRepository.findAll();
    }

    @Override
    public Optional<EstudantesEntity> findEstudanteById(Long id) {
        return estudanteRepository.findById(id);
    }

    @Override
    public EstudantesEntity addEstudante(EstudantesEntity estudantesEntity) {
        if(estudantesEntity != null){
            return estudanteRepository.save(estudantesEntity);
        }
        return new EstudantesEntity();
    }

    @Override
    public String deleteEstudante(Long id) {
        // Se o estudante for encontrado pelo ID, ai deleta.
        if(estudanteRepository.findById(id).isPresent()){
            estudanteRepository.deleteById(id);
            return "Estudante apagado!";
        }
        return "Estudante não encontrado";
    }

    @Override
    public String updateEstudante(EstudantesEntity estudantesEntity) {
        if(estudantesEntity != null && estudanteRepository.findById(estudantesEntity.getId()).isPresent()){
            estudanteRepository.saveAndFlush(estudantesEntity);
            return "Estudante atualizado";
        }
        return "Não foi possível atualizar o estudante";
    }
}
