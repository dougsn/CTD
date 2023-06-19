package com.catalog.catalog.service;

import com.catalog.catalog.custom.CustomLoadBalancerConfiguration;
import com.catalog.catalog.entity.MovieDTO;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("MOVIE-SERVICE")
public interface MovieClient {

    @GetMapping("/movie/v1/movie/{genero}")
    List<MovieDTO> findByGenero(@PathVariable String genero);
    @GetMapping("/movie/v1/movie")
    List<MovieDTO> findAll();
    @GetMapping("/movie/v1/movie/listener")
    public List<MovieDTO> findListener();
}
