package com.catalog.catalog.service.impl;


import com.catalog.catalog.service.CatalogService;
import com.catalog.catalog.service.MovieClient;
import com.movie.movie.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class CatalogServiceImpl implements CatalogService {
    final static Logger log = Logger.getLogger(CatalogServiceImpl.class.getName());

    @Autowired
    private MovieClient movieClient;

    @Override
    public List<Movie> findByGenero(String genero) {
        List<Movie> movie;
        movie = movieClient.findByGenero(genero);
        if (movie != null){
            log.info("Buscando filmes pelo genero: " + genero);
            return movie;
        } else {
            log.info("Não foi possível buscar os filmes do genero: " + genero);
            return null;
        }
    }

    @Override
    public List<Movie> findAll() {
        log.info("Buscando todos os filmes");
        List<Movie> movies;
        return movies = movieClient.findAll();
    }

}
