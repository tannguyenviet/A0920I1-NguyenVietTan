package com.service;

import com.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    Student getStudentById(String id);
    void deleteStudentById(String id);
    void updateStudent(Student student);
    void addNewStudent(Student student);
}
