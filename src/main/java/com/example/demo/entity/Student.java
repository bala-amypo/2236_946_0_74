package com.example.demo.entity;
public class Student{
    private Long id;
    private String stuname;
    private String stuemail;
    private float cgpa;


    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getStuname(){
        return stuname;
    }
    public void setStuname(String stuname){
        this.stuname=stuname;
    }
    public String getStuemail(){
        return stuemail;
    }
    public void setStuemail(String stuemail){
        this.stuemail=stuemail;
    }
    public float getCgpa(){
        return cgpa;
    }
    public void setCgpa(float cgpa){
        this.cgpa=cgpa;
    }


}