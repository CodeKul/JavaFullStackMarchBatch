package com.example.JavaFullStackMarchBatch.rest;

import javax.persistence.Entity;


public class Student {
    int id;
    String name;
    Integer contact;

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
}
