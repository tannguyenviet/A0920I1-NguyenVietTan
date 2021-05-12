package com.service;

import com.model.Student;
import com.repository.StudentRepository;
import com.repository.StudentRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private  StudentRepository studentRepository = new StudentRepositoryImpl();


    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    @Override
    public Student getStudentById(String id) {
        return studentRepository.getStudentById(id);
    }

    @Override
    public void deleteStudentById(String id) {
        studentRepository.deleteStudentById(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentRepository.updateStudent(student);
    }

    @Override
    public void addNewStudent(Student student) {
        studentRepository.addNewStudent(student);
    }
}
