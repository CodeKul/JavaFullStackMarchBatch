package com.example.JavaFullStackMarchBatch.aop;

import org.springframework.stereotype.Component;

@Component
public class GirlStudent {

    public String studyOne(){
        System.out.println("I am girl & studying");
        return "Hii";
    }
}
