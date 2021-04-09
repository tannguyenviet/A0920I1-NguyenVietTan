package service;

import dao.StudentDAO;
import dao.StudentDAOImpl;
import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService {
    private static Map<String,Student> studentMap;
    private StudentDAO studentDAO = new StudentDAOImpl();
    public StudentServiceImpl() {
        if(studentMap!=null){
            return;
        }
        studentMap = new HashMap<>();
        studentMap.put("1",new Student("1","Tan",19,"385 Thanh Nghi"));
        studentMap.put("2",new Student("2","Tannn",54,"385 Thanh Nghi"));
        studentMap.put("3",new Student("3","Tannnnn",50,"385 Thanh Nghi"));
        studentMap.put("4",new Student("4","Tan",19,"385 Thanh Nghi"));

    }

    @Override
    public Student getStudentById(String id) {
        return studentDAO.selectStudentById(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentDAO.selectAllStudent();
    }

    @Override
    public void saveStudent(Student student) {
        studentDAO.insertStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentDAO.updateStudent(student);
    }

    @Override
    public void deleteStudent(String id) {
        studentDAO.deleteStudent(id);
    }
}
