package com.example.catalog.client;

import com.example.catalog.dto.MovieDTO;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "MOVIE-SERVICE")
@LoadBalancerClient(name = "MOVIE-SERVICE")
public interface MovieClient {


    @GetMapping("/movie-api/movie/{genre}")
    List<MovieDTO> findByGenre(@PathVariable String genre);
}
