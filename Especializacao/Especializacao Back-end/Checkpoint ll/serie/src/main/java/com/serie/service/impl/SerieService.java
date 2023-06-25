package com.serie.service.impl;

import com.serie.entity.Season;
import com.serie.entity.Serie;
import com.serie.repository.ISerieRepository;
import com.serie.service.ISerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerieService implements ISerieService<Serie> {

    @Autowired
    private ISerieRepository repository;

    @Override
    public List<Serie> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Serie> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Optional<Serie> add(Serie serie) {
        Serie s = repository.saveAndFlush(new Serie(null, serie.getName(), serie.getGenre(), serie.getSeasons()));
        return Optional.of(s);
    }

    public List<Serie> findByGenero(String genero) {
        return repository.findByGenre(genero);
    }
    @Override
    public Boolean hardDelete(Long id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}

