package com.example.catalog.service;

import com.example.catalog.client.MovieClient;
import com.example.catalog.dto.MovieDTO;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class CatalogServiceImpl implements CatalogService {

    @Value("${queue.movie-service}")
    private String queue;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private MovieClient movieClient;

    @Override
    @CircuitBreaker(name = "movie-service", fallbackMethod = "fallback")
    public List<MovieDTO> findByGenre(String genre) {
        return movieClient.findByGenre(genre);
    }

    @Override
    public void save(MovieDTO dto) {
        rabbitTemplate.convertAndSend(queue, dto);
    }

    public List<MovieDTO> fallback(String genre, CallNotPermittedException ex) {
        try{
            throw new RuntimeException("logstash- "+ex.getCausingCircuitBreakerName());
        }catch (RuntimeException e){
            System.out.println("Test log");
        }
        var dto = MovieDTO.builder().description("Serviço indisponível").genre(ex.getCausingCircuitBreakerName()).build();
        return Arrays.asList(dto);
    }
}
