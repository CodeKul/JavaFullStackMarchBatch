package com.example.JavaFullStackMarchBatch.di;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    int id;
    String name;
    String address;

    public void show(){
        System.out.println("In show");
    }

    public int getId() {
        return id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
