package com.example.JavaFullStackMarchBatch.aop;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
public class BoyStudent {

    public void study(){
        System.out.println("I am boy & studying");
    }
}
