package com.example.movie.queue;

import com.example.movie.dto.MovieDTO;
import com.example.movie.service.MovieService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieListener {


    @Autowired
    private MovieService service;

    @RabbitListener(queues = {"${queue.movie-service}"})
    public void listen(MovieDTO dto) {
        service.save(dto);
    }
}
