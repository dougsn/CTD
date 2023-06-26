package com.serie.queue;

import com.serie.entity.Serie;
import com.serie.service.impl.SerieService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SerieListener {

    @Autowired
    private SerieService service;

    @RabbitListener(queues = {"${queue.serie-service}"})
    public void listen(Serie serie) {service.add(serie);}

}
