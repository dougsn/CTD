package com.movie.movie.config;


import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMqSenderConfig {

    @Value("${queue.movie.name}")
    private String movieQueue;


    @Bean
    public Queue queue() {
        return new Queue(this.movieQueue, false);
    }


}
