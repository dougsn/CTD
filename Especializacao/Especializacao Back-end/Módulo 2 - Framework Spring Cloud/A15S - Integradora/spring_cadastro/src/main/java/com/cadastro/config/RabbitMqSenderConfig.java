package com.cadastro.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Queue;

@Configuration
public class RabbitMqSenderConfig {

    @Value("${queue.pessoa.name}")
    private String pessoaQueue;


//    @Bean
//    public Queue queue() {
//        // Verificar
//    }

}
