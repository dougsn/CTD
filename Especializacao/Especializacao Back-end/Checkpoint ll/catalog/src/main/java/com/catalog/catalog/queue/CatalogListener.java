package com.catalog.catalog.queue;

import com.catalog.catalog.service.impl.CatalogServiceImpl;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CatalogListener {

    @Autowired
    private CatalogServiceImpl service;

    @RabbitListener(queues = {"${queue.catalog-movie-service}"})
    public void listenMovie(String genero) {
        service.sendCatalogo(genero);
    }

    @RabbitListener(queues = {"${queue.catalog-serie-service}"})
    public void listenSerie(String genero) {
        service.sendCatalogo(genero);
    }

}