package com.dev.repository;
import com.dev.model.Student;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> students;

    public void studentData(){
        this.students = new ArrayList<>();
        students.add(new Student("Sunny",1));
        students.add(new Student("Pinky",2));
        students.add(new Student("Bunny",3));
    }

    public void deleteStudentData(){
        this.students = null;
        System.out.println("Students Data Deleted");
    }

    public List<Student> findAll(){
        return this.students;
    }
}
