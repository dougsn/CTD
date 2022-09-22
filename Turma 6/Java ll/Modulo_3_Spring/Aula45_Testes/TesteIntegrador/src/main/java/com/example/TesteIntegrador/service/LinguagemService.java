package com.example.TesteIntegrador.service;

import com.example.TesteIntegrador.model.LinguagemModel;
import com.example.TesteIntegrador.repository.LinguagemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinguagemService {

    private LinguagemRepository linguagemRepository;

    public LinguagemService() {
        this.linguagemRepository = new LinguagemRepository();
    }

    public LinguagemModel buscarPorTipo(String tipo){
        return linguagemRepository.buscarPorTipo(tipo);
    }

    public List<LinguagemModel> buscarTodos(){
        return linguagemRepository.buscarTodos();
    }


}
