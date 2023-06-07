package com.student.controller;

import com.student.entity.Student;
import com.student.service.StudentService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    public ResponseEntity<String> Hello() {
        return ResponseEntity.ok().body("Olá mundo !");
    }

    @GetMapping("/{id}")
    public Optional<Student> find (@PathVariable Long id, @RequestParam(defaultValue = "false") Boolean throwError, HttpServletResponse response) {
        return service.find(id, throwError);
    }

}
