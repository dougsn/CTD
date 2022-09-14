package com.example.esporteHQL.service;

import com.example.esporteHQL.entity.TreinadorEntity;
import com.example.esporteHQL.repository.ITreinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreinadorService {

    private ITreinadorRepository treinadorRepository;

    @Autowired
    public TreinadorService(ITreinadorRepository treinadorRepository) {
        this.treinadorRepository = treinadorRepository;
    }

    public List<TreinadorEntity> buscarTodos(){
        return treinadorRepository.findAll();
    }

    public TreinadorEntity buscarPorIdade(Integer idade){
        return treinadorRepository.findTreinadorByIdade(idade).get();
    }


}
