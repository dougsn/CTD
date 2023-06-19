package com.catalog.catalog.service.impl;


import com.catalog.catalog.entity.MovieDTO;
import com.catalog.catalog.service.CatalogService;
import com.catalog.catalog.service.MovieClient;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
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
    @CircuitBreaker(name = "movie-service", fallbackMethod = "getMovieFallback")
    public List<MovieDTO> findByGenero(String genero) {
        List<MovieDTO> movie;
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
    public List<MovieDTO> findAll() {
        log.info("Buscando todos os filmes");
        List<MovieDTO> movies;
        return movies = movieClient.findAll();
    }

    @Override
    public List<MovieDTO> findAllListener() {
        List<MovieDTO> movies;
        return movies = movieClient.findListener();
    }

    public MovieDTO getMovieFallback(String genero, CallNotPermittedException e) {
        var movie = new MovieDTO();
        movie.setGenero(genero);
        movie.setName("Erro");
        movie.setUrlStream("asdasd");

        return movie;
    }

}
