package com.example.course.course.service.impl;

import com.example.course.course.service.CourseService;
import com.example.course.course.service.SubscriptionClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@Service
public class CourseServiceImpl  implements CourseService {

    @Autowired
    private SubscriptionClient subscriptionService;

    private static AtomicInteger COUNT_CALL_GATEWAY = new AtomicInteger();

    public String getSubscriptionPort() {
        String port = subscriptionService.getPort();
        log.info("COURSE-SERVICE consumindo o SUBSCRIPTION-SERVER na porta: " + port);
        log.info("Quantidade de request: " + COUNT_CALL_GATEWAY.incrementAndGet());
        return port;
    }
}
