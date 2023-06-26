package com.serie.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQSenderConfig {

    @Value("${queue.serie-service}")
    private String queueSerie;

    @Value("${queue.catalog-serie-service}")
    private String queueCatalogSerie;

    @Bean
    public Queue SerieQueue() {
        return new Queue(this.queueSerie,false);
    }

    @Bean
    public Queue CatalogSerieQueue() {
        return new Queue(this.queueCatalogSerie,false);
    }

}
