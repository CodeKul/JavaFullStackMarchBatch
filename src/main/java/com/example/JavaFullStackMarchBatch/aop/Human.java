package com.example.JavaFullStackMarchBatch.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {

    @Autowired
    private JavaMailSender mailSender;


//    @Before("execution(public * study*(..))")
//    public void wakeUp(){
//        System.out.println("Wake up");
//    }

    @After("execution(public * study*())")
    public void sleep(){
        System.out.println("Sleep");
    }

//    @Pointcut("execution(public * study*())")
//    public void point(){}

    @AfterReturning(pointcut = "execution(public * study*(..))",returning = "value")
    public void wakeUp(int value){
        System.out.println("Wake up"+value);
    }

    @AfterReturning(pointcut = "execution(public * saveUser(..))",returning = "email")
    public void sendMailWithReg(String email){
        mail(email);
    }

    public void mail(String mail){
        String from = "codekul.vaibhav@gmail.com";

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(from);
        message.setTo(mail);
        message.setSubject("Hii Daud");
        message.setText("Hii Daud, How are you...!");

        mailSender.send(message);
    }
}
