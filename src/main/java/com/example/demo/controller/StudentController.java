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
    public  String updateDataById(@PathVariable Long id,@RequestBody Student stu){
      if(student.isPresent()){
        stu.setId(id);
        stser.createData(stu);
      }
      else{
        return id+" not found";
      }
      }


      @DeleteMapping("/deletedata/{id}")
      public String deleteDataById(@PathVariable Long id){
        Optional<Student> student = ser.fetchDataById(id);
          if(student.isPresent()){
     
               stser.deleteData(id);
               return "Data deleted successfully";
      }
      else{
        return id+" not found";
      }

      }
   
}