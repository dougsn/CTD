package com.example.Filmes.service;

import com.example.Filmes.entities.FilmeEntities;
import com.example.Filmes.repository.FilmeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    private final FilmeRepository  filmeRepository;

    public FilmeService(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    public FilmeEntities salvar(FilmeEntities filmeEntities){
        return filmeRepository.save(filmeEntities);
    }

    public List<FilmeEntities> buscarTodos(){
        return filmeRepository.findAll();
    }

    public FilmeEntities buscarId(Integer id){
        return filmeRepository.findById(id).get();
    }

    public FilmeEntities atualizar(FilmeEntities filmeEntities){
        return filmeRepository.saveAndFlush(filmeEntities);
    }

    public void deletar(Integer id){
        filmeRepository.deleteById(id);
    }



}
