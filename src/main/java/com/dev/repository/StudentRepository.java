package com.dev.repository;

import com.dev.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {


    public List<Student> students;

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> findAll(){
        return this.students;
    }
}
