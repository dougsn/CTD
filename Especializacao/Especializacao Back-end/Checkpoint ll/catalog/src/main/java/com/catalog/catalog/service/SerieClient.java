package com.catalog.catalog.service;

import com.catalog.catalog.custom.CustomLoadBalancerConfiguration;
import com.catalog.catalog.entity.SerieDTO;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("SERIE-SERVICE")
@LoadBalancerClient(value = "SERIE-SERVICE", configuration = CustomLoadBalancerConfiguration.class)
public interface SerieClient {

    @GetMapping("/serie-api/serie/{genero}")
    List<SerieDTO> findByGenero(@PathVariable String genero);

    @GetMapping("/serie-api/serie")
    List<SerieDTO> findAll();

}
