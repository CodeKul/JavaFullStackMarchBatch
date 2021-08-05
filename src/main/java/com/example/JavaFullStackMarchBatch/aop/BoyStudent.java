package com.example.JavaFullStackMarchBatch.aop;


import org.springframework.stereotype.Component;

@Component
public class BoyStudent {

    public int studyTwo(int i,int j){
        System.out.println("I am boy & studying");
        return i+j;
    }
}
