package com.example.course.course.service.impl;

import com.example.course.course.DTO.StudentDTO;
import com.example.course.course.service.CourseService;
import com.example.course.course.service.StudentClient;
import com.example.course.course.service.SubscriptionClient;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;


@Service
public class CourseServiceImpl  implements CourseService {

//    @Autowired
//    private SubscriptionClient subscriptionService;

    @Autowired
    private StudentClient studentClient;

//    private static AtomicInteger COUNT_CALL_GATEWAY = new AtomicInteger();
//
//    public String getSubscriptionPort() {
//        String port = subscriptionService.getPort();
//        log.info("COURSE-SERVICE consumindo o SUBSCRIPTION-SERVER na porta: " + port);
//        log.info("Quantidade de request: " + COUNT_CALL_GATEWAY.incrementAndGet());
//        return port;
//    }

    @Override
    public String getCourseHello() {
        return studentClient.Hello();
    }

    @Override
    @CircuitBreaker(name = "student", fallbackMethod = "getStudentFallbackValue")
    @Retry(name = "student")
    public Optional<StudentDTO> getStudentById(Long id, Boolean throwError) {
        Optional<StudentDTO> response = studentClient.find(id, true);
        return response;
    }

    private void getStudentFallbackValue(CallNotPermittedException ex) throws Exception {
        throw new Exception("Circuit breaker was actived");
    }


}
