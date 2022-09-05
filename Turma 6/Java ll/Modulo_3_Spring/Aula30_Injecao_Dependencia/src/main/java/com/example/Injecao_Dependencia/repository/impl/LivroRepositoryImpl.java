package com.example.Injecao_Dependencia.repository.impl;

import com.example.Injecao_Dependencia.entity.LivroEntity;
import com.example.Injecao_Dependencia.repository.ILivroRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // Deixando explicito para o Spring que essa classe é um repositório.
public class LivroRepositoryImpl implements ILivroRepository {

    @Override
    public List<LivroEntity> buscarTodosLivros() {

        List<LivroEntity> livroEntities = new ArrayList<>();

        livroEntities.add(new LivroEntity(1,"Clean Code","Robert C. Martin"));
        livroEntities.add(new LivroEntity(2,"Marley & Eu","Arivado Camargo"));

        return livroEntities;
    }
}
