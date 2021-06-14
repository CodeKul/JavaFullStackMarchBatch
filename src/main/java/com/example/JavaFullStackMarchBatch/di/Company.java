package com.example.JavaFullStackMarchBatch.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")
//prototype
public class Company {

    int id;
    String name;
    String location;

    public Company(){
        System.out.println("In cont");
    }

    public int getId() {
        return id;
    }

    //field based injection
    @Autowired
    private Employee employee;

    //constructor based injection
//    private Employee employee;

//    @Autowired
//    public Company(Employee employee){
//        this.employee = employee;
//    }

//setter based injection
    @Autowired
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    public void showEmpInfo(){
        employee.show();
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
