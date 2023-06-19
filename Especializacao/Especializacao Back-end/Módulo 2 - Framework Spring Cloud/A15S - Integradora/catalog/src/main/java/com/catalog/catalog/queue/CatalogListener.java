package com.catalog.catalog.queue;


import com.catalog.catalog.service.MovieClient;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CatalogListener {

    @Autowired
    private MovieClient cliente;

    @RabbitListener(queues = {"${queue.movie.name}"})
    public void listen() {cliente.findListener();}

}
