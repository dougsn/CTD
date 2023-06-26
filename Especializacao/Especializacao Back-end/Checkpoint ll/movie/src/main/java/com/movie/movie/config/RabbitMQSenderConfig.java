package com.movie.movie.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQSenderConfig {

    @Value("${queue.movie-service}")
    private String queueMail;

    @Value("${queue.catalog-movie-service}")
    private String queueCatalogMovie;

    @Bean
    public Queue MailQueue() {
        return new Queue(this.queueMail,false);
    }
    @Bean
    public Queue CatalogMovieQueue() {
        return new Queue(this.queueCatalogMovie,false);
    }
}
