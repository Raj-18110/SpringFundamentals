package com.dev.configuration;

import com.dev.model.Student;
import com.dev.repository.StudentRepository;
import com.dev.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Student> studentList(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sunny",1));
        students.add(new Student("Pinky",2));
        students.add(new Student("Bunny",3));
        return students;
    }

    @Bean
    public StudentService studentService(){
        StudentService studentService = new StudentService();
        studentService.setStudentRepository(studentRepository());
        return studentService;
    }

    @Bean
    public StudentRepository studentRepository(){
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.setStudents(studentList());
        return studentRepository;
    }
}
