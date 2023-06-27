package com.serie.service.impl;

import com.serie.entity.Season;
import com.serie.entity.Serie;
import com.serie.repository.ISerieRepository;
import com.serie.service.ISerieService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerieService implements ISerieService<Serie> {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${queue.catalog-serie-service}")
    private String queue;

    @Autowired
    private ISerieRepository repository;

    @Override
    public List<Serie> findAll() {
        return repository.findAll();
    }


    @Override
    public Optional<Serie> add(Serie serie) {
        Serie s = repository.save(new Serie(null, serie.getName(), serie.getGenre(), serie.getSeasons()));
        rabbitTemplate.convertAndSend(queue, serie.getGenre());
        return Optional.of(s);
    }

    public List<Serie> findByGenero(String genero) {
        return repository.findByGenre(genero);
    }

}

