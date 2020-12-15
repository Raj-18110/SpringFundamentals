package com.dev.repository;
import com.dev.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> students;

    @Autowired
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> findAll(){
        return this.students;
    }
}
