package com.dev.configuration;

import com.dev.model.Student;
import com.dev.repository.StudentRepository;
import com.dev.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean(initMethod = "beforeCreation",destroyMethod = "beforeCreation")
    public StudentService studentService(){
        return new StudentService(studentRepository());
    }

    @Bean(initMethod = "studentData",destroyMethod = "deleteStudentData")
    public StudentRepository studentRepository(){
        return new StudentRepository();
    }
}
