package com.example.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

@Component
public class LogFilter extends AbstractGatewayFilterFactory<LogFilter.Config> {

    private static Logger log = Logger.getLogger(LogFilter.class.getName());
    private static AtomicInteger COUNT_CALL_GATEWAY = new AtomicInteger(0);

    public LogFilter() {

        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            log.info("Path requested: "+ exchange.getRequest().getPath());
            log.info("API Gateway requested " + COUNT_CALL_GATEWAY.incrementAndGet() + " times");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                //Filtro posterior a invocação do serviço real associado ao gateway
                log.info("Time Response : " + Calendar.getInstance().getTime());
                log.info("Número de chamadas ao gateway: " + COUNT_CALL_GATEWAY.incrementAndGet());
            }));
        };
    }

    public static class Config {

    }
}
