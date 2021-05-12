package com.repository;

import com.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements  StudentRepository{
    static List<Student> students;
    static {
        students= new ArrayList<>();
        students.add(new Student("1","Tan",16));
        students.add(new Student("2","Tien",20));
        students.add(new Student("3","Tung",19));
        students.add(new Student("4","Quan",18));
    }
    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public Student getStudentById(String id) {
        return students.get(Integer.parseInt(id));
    }

    @Override
    public void deleteStudentById(String id) {
        for(int i =0;i<students.size();i++){
            if (students.get(i).getId().equals(id)){
                students.remove(i);
                break;
            }
        }
    }

    @Override
    public void updateStudent(Student student) {
        return;
    }

    @Override
    public void addNewStudent(Student student) {
        students.add(student);
    }
}
