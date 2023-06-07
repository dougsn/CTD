package com.example.course.course.resource;

import com.example.course.course.DTO.StudentDTO;
import com.example.course.course.service.CourseService;
import com.example.course.course.service.impl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@RestController
@RequestMapping("/course")
public class CourseResource {

    @Autowired
    private CourseServiceImpl service;

//    @GetMapping("/subscription/port")
//    public ResponseEntity<String> getSubscriptionPort(){
//        return ResponseEntity.ok(service.getSubscriptionPort());
//    }

    @GetMapping("/student")
    public ResponseEntity<String> Hello(){
        return ResponseEntity.ok(service.getCourseHello());
    }

    @GetMapping("/student/{id}")
    public Optional<StudentDTO> find (@PathVariable Long id, @RequestParam(defaultValue = "false") Boolean throwError, HttpServletResponse response) {
        return service.getStudentById(id, throwError);
    }

}