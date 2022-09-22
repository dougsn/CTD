package com.example.TesteIntegrador.repository;

import com.example.TesteIntegrador.model.LinguagemModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LinguagemRepository {
    List<LinguagemModel> linguagemModels = new ArrayList<>();

    public LinguagemRepository() {

        linguagemModels.add(new LinguagemModel("Java",true));
        linguagemModels.add(new LinguagemModel("Pascal",false));

    }

    public LinguagemModel buscarPorTipo(String tipo){
        for(LinguagemModel linguagemModel:linguagemModels){
            if(linguagemModel.getName().equals(tipo)){
                return linguagemModel;
            }
        }
        return null;
    }

    public List<LinguagemModel> buscarTodos(){
        return linguagemModels;
    }


}
