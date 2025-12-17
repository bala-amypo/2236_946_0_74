package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
public class StudentController {

    @Autowired
    StudentService stser;
    @PostMapping("/adddata")
    public Student createData(@RequestBody Student stu){
       return stser.createData(stu);
    }
    @GetMapping("/fetchrecord")
    public List<Student> fetchRecord(){
      return stser.fetchRecord();
    }
    @GetMapping("/fetchbyid/{id}")
    public  Optional<Student> fetchDataById(@PathVariable Long id){
         return stser.fetchDataById(id);
    }
    @PutMapping("/updatedata/{id}")
    public  String uDataById(@PathVariable int id,@RequestBody Student stu){
     stu.setId(id);
     stuser.createData(stu);
     return "Data updation done!!!";


    }
   
}