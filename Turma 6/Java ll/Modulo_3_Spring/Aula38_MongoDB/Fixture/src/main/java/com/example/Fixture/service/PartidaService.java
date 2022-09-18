package com.example.Fixture.service;

import com.example.Fixture.entity.EstadoEntity;
import com.example.Fixture.entity.PartidaEntity;
import com.example.Fixture.repository.IPartidaRepository;
import com.example.Fixture.sequence.SequenceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidaService  {
    @Autowired
    private SequenceDao sequenceDao;

    private static final String PARTIDA_SEQ_KEY = "partida";
    private static final String EQUIPE_SEQ_KEY = "equipe";
    private IPartidaRepository partidaRepository;

    public PartidaService(IPartidaRepository partidaRepository) {
        this.partidaRepository = partidaRepository;
    }

    public PartidaEntity adicionar(PartidaEntity partidaEntity){
        partidaEntity.setId(sequenceDao.getNextSequenceId(PARTIDA_SEQ_KEY));
        partidaEntity.getEquipeLocal().setId(sequenceDao.getNextSequenceId(EQUIPE_SEQ_KEY));
        partidaEntity.getEquipeVisitante().setId(sequenceDao.getNextSequenceId(EQUIPE_SEQ_KEY));
        return partidaRepository.save(partidaEntity);
    }

    public List<PartidaEntity> listarTodos(){
        return partidaRepository.findAll();
    }

    public List<PartidaEntity> partidaAoVivo(){
        return partidaRepository.findAllByEstado(EstadoEntity.AO_VIVO);
    }



}



