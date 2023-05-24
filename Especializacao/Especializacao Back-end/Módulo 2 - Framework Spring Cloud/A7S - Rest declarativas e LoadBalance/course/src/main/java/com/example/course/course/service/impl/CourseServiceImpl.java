package com.example.course.course.service.impl;

import com.example.course.course.service.CourseService;
import com.example.course.course.service.SubscriptionClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CourseServiceImpl  implements CourseService {

    @Autowired
    private SubscriptionClient subscriptionService;

    @Override
    public String getSubscriptionPort() {
        var port = subscriptionService.getPort();
        log.info("COURSE-SERVICE consumindo o SUBSCRIPTION-SERVER na porta: " + port);
        return port;
    }
}
