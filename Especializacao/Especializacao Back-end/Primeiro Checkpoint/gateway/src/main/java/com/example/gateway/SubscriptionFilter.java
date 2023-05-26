package com.example.gateway;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import reactor.core.publisher.Mono;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

public class SubscriptionFilter extends AbstractGatewayFilterFactory<SubscriptionFilter.Config> {

    private static Logger log = Logger.getLogger(SubscriptionFilter.class.getName());
    private static AtomicInteger COUNT_CALL_GATEWAY = new AtomicInteger(0);

    public SubscriptionFilter() {super(Config.class);}

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            log.info("Path request: " + exchange.getRequest().getPath());
            log.info("API Gateway request: " + COUNT_CALL_GATEWAY.incrementAndGet());
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                log.info("Time response: " + Calendar.getInstance().getTime());
            }));
        };
    }

    public static class Config {

    }

}
