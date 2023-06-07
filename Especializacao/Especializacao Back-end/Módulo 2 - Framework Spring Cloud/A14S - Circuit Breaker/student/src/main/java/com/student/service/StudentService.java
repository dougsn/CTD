package com.student.service;

import com.student.entity.Student;
import com.student.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private IStudentRepository repository;

    public Optional<Student> find (Long id, Boolean throwError) throws RuntimeException {
        if (throwError) throw new RuntimeException();

        return repository.findById(id);
    }
}
