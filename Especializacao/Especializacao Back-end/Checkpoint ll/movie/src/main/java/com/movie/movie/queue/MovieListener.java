package com.movie.movie.queue;

import com.movie.movie.entity.Movie;
import com.movie.movie.service.MovieService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieListener {

    @Autowired
    private MovieService service;

    @RabbitListener(queues = {"${queue.movie-service}"})
    public void listen(Movie movie) {service.addMovie(movie);}

}
