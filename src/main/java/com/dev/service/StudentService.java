package com.dev.service;

import com.dev.model.Student;
import com.dev.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentService {


    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }
}
