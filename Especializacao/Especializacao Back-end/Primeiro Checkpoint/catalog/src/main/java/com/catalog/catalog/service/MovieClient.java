package com.catalog.catalog.service;

import com.catalog.catalog.custom.CustomLoadBalancerConfiguration;
import com.catalog.catalog.entity.MovieDTO;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("MOVIE-SERVICE")
@LoadBalancerClient(value = "MOVIE-SERVICE", configuration = CustomLoadBalancerConfiguration.class)
public interface MovieClient {

    @GetMapping("/movie/{genero}")
    List<MovieDTO> findByGenero(@PathVariable String genero);

    @GetMapping("/movie")
    List<MovieDTO> findAll();
}
