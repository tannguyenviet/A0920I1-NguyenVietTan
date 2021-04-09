package dao;

import model.Student;

import java.util.List;

public interface StudentDAO {

    List<Student> selectAllStudent();
    Student selectStudentById(String id);
    void deleteStudent(String id);
    void updateStudent(Student student);
    void insertStudent(Student student);
}
