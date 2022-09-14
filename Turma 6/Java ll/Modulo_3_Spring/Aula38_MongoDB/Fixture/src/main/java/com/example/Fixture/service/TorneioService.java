package com.example.Fixture.service;

import com.example.Fixture.entity.TorneioEntity;
import com.example.Fixture.repository.ITorneioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TorneioService {

    private ITorneioRepository torneioRepository;

    public TorneioService(ITorneioRepository torneioRepository) {
        this.torneioRepository = torneioRepository;
    }

    public TorneioEntity salvar(TorneioEntity torneioEntity){
        return torneioRepository.save(torneioEntity);
    }

    public List<TorneioEntity> buscarTodos() {
        return torneioRepository.findAll();
    }


}
