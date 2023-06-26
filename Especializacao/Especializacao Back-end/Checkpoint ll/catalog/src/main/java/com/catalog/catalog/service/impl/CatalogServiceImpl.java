package com.catalog.catalog.service.impl;


import com.catalog.catalog.entity.Catalog;
import com.catalog.catalog.entity.MovieDTO;
import com.catalog.catalog.entity.SerieDTO;
import com.catalog.catalog.repository.ICatalogRepository;
import com.catalog.catalog.service.CatalogService;
import com.catalog.catalog.service.MovieClient;
import com.catalog.catalog.service.SerieClient;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class CatalogServiceImpl implements CatalogService {
    final static Logger log = Logger.getLogger(CatalogServiceImpl.class.getName());

    @Autowired
    private ICatalogRepository repository;

    @Value("${queue.movie-service}")
    private String queue;

    @Value("${queue.serie-service}")
    private String queueSerie;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private MovieClient movieClient;

    @Autowired
    private SerieClient serieClient;
    @Override
    public List<SerieDTO> serieByGenero(String genero) {
        List<SerieDTO> serie;
        serie = serieClient.findByGenero(genero);
        return serie;
    }

    public void sendCatalogo(String genero) {
        List<SerieDTO> series = serieClient.findByGenero(genero);
        List<MovieDTO> movies = movieClient.findByGenero(genero);
        Catalog catalog = new Catalog(genero, movies, series);

        repository.save(catalog);
    }

    public List<Catalog> findAllCatalogs() {
        return repository.findAll();
    }

    @Override
    public List<SerieDTO> allSeries() {
        List<SerieDTO> series = serieClient.findAll();
        return series;
    }

    @Override
    // @CircuitBreaker(name = "movie-service", fallbackMethod = "getMovieFallback")
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
        List<MovieDTO> movies = movieClient.findAll();
        return movies;
    }


    public void add(MovieDTO dto) {
        rabbitTemplate.convertAndSend(queue,dto);
    }


    public MovieDTO getMovieFallback(String genero, CallNotPermittedException e) {
        var movie = new MovieDTO();
        movie.setGenero(genero);
        movie.setName("Erro");
        movie.setUrlStream("asdasd");

        return movie;
    }

}
