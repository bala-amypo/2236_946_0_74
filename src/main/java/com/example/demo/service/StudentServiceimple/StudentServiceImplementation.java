package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentServiceImplementation implements StudentService{
@Autowired
StudentRepository repo;
@Override
    public Student createData(Student stu){
        return repo.save(stu);
    }
@Override
    public List<Student> fetchRecord(){
        return repo.findAll();
    }
@Override
public Optional<Student> fetchDataById(Long id){
    return repo.findById(id);
}
@Override
public void deleteData(Long id){
    repo.deleteById(id);
}
}