package com.codegym.demojpa.repository;

import com.codegym.demojpa.model.Student;


import java.util.List;


public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByName(String name);

}
