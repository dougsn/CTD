package com.example.course.course.service;

import com.example.course.course.DTO.StudentDTO;
import com.example.course.course.custom.CustomLoadBalancerConfiguration;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@FeignClient("STUDENT-SERVICE") // Microsserviço que será consumido, pegando referência do EurekaServer
@LoadBalancerClient(value = "STUDENT-SERVICE", configuration = CustomLoadBalancerConfiguration.class) // Configurando o LoadBalancer
public interface StudentClient {

    @GetMapping("/student")
    String Hello();

    @GetMapping("/student/{id}")
    Optional<StudentDTO> find (Long id,Boolean throwError);

}
