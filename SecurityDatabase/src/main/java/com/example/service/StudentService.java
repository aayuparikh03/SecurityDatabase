package com.example.service;

import com.example.entity.Student;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

public interface StudentService {

    @PreAuthorize("hasAnyRole('STUDENT', 'TEACHER', 'ADMIN')")
    List<Student> findAll();

    @PreAuthorize("hasAnyRole('STUDENT', 'TEACHER', 'ADMIN')")
    Student findById(int id);

    @PreAuthorize("hasRole('TEACHER')")
    Student save(Student student);

    @PreAuthorize("hasRole('TEACHER')")
    Student update(int id, Student student);

    @PreAuthorize("hasRole('ADMIN')")
    void deleteById(int id);
}
