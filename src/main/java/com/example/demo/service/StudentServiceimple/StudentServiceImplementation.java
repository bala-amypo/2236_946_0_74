package com.example.demo.service.StudentServiceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentServiceImplementation implements StudentService{
@Autowired
StudentRepository repo;
@override
    public Student createData(Student stu){
        return repo.save(stu);
    }
@override
    public List<Student> fetchRecord(){
        return repo.findAll();
    }
}