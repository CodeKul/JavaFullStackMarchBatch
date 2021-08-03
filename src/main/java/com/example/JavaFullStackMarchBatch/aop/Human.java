package com.example.JavaFullStackMarchBatch.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {

    @Before("execution(public void study())")
    public void wakeUp(){
        System.out.println("Wake up");
    }

    @After("execution(public void study())")
    public void sleep(){
        System.out.println("Sleep");
    }
}
