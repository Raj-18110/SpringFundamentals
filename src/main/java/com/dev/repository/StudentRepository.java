package com.dev.repository;
import com.dev.model.Student;

import java.util.List;

public class StudentRepository {
    private List<Student> students;

    public StudentRepository(List<Student> students) {
        this.students = students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> findAll(){
        return this.students;
    }
}
