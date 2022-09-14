package com.example.esporteHQL.service;

import com.example.esporteHQL.entity.JogadorEntity;
import com.example.esporteHQL.repository.IJogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {

    private IJogadorRepository jogadorRepository;

    @Autowired
    public JogadorService(IJogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    public List<JogadorEntity> buscarTodos(){
        return jogadorRepository.findAll();
    }

    public JogadorEntity buscarPorNome(String nome){
        return jogadorRepository.findJogadorByName(nome).get();
    }



}
