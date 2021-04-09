package service;

import model.Student;

import java.util.List;

public interface StudentService {
    Student getStudentById(String id);
    List<Student> getAllStudent();
    void saveStudent (Student student);
    void updateStudent(Student student);
    void deleteStudent(String id);


}
