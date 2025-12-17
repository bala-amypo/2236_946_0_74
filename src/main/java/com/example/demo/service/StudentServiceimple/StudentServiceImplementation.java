package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
@service
public class StudentServiceImplementation implements StudentService{
@Autowired
StudentRepository repo;
    public Student createData(Student stu){
        return repo.save(stu);
    }
    public List<Student> fetchRecord(){
        return repo.findAll();
    }
}