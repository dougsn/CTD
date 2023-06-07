package com.example.course.course.service;

import com.example.course.course.DTO.StudentDTO;

import java.util.Optional;

public interface CourseService {
//    String getSubscriptionPort();
    String getCourseHello();
    Optional<StudentDTO> getStudentById (Long id,Boolean throwError);
}
