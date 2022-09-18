package com.example.Fixture.service;

import com.example.Fixture.entity.TorneioEntity;
import com.example.Fixture.repository.ITorneioRepository;
import com.example.Fixture.sequence.SequenceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TorneioService {

    @Autowired
    private SequenceDao sequenceDao;

    private static final String TORNEIO_SEQ_KEY = "torneio";
    private ITorneioRepository torneioRepository;

    public TorneioService(ITorneioRepository torneioRepository) {
        this.torneioRepository = torneioRepository;
    }

    public TorneioEntity salvar(TorneioEntity torneio){
        torneio.setId(sequenceDao.getNextSequenceId(TORNEIO_SEQ_KEY));
        return torneioRepository.save(torneio);
    }

    public List<TorneioEntity> buscarTodos(){
        return torneioRepository.findAll();
    }




}
