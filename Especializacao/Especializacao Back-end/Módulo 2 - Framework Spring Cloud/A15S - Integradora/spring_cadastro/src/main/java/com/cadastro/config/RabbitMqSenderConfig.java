package com.cadastro.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMqSenderConfig {

    @Value("${queue.pessoa.name}")
    private String pessoaQueue;


    @Bean
    public Queue queue() {
        return new Queue(this.pessoaQueue, true);
    }

}
