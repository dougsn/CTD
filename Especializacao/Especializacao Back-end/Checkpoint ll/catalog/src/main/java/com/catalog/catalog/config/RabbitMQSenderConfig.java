package com.catalog.catalog.config;

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

    @Value("${queue.serie-service}")
    private String queueSerie;

    @Value("${queue.catalog-serie-service}")
    private String queueCatalogSerie;

    @Bean
    public Queue MailQueue() {
        return new Queue(this.queueMail,false);
    }

    @Bean
    public Queue SerieQueue() {
        return new Queue(this.queueSerie, false);
    }

    @Bean
    public Queue CatalogSerieQueue() {
        return new Queue(this.queueCatalogSerie,false);
    }

    @Bean
    public Queue CatalogMovieQueue() {
        return new Queue(this.queueCatalogMovie,false);
    }

}
