package com.example.course.course.service;

import com.example.course.course.custom.CustomLoadBalancerConfiguration;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SUBSCRIPTION-SERVICE") // Microsserviço que será consumido, pegando referência do EurekaServer
@LoadBalancerClient(value = "SUBSCRIPTION-SERVICE", configuration = CustomLoadBalancerConfiguration.class) // Configurando o LoadBalancer
public interface SubscriptionClient {
    @GetMapping("/subscription/port") // Método que será consumido.
    String getPort();
}
