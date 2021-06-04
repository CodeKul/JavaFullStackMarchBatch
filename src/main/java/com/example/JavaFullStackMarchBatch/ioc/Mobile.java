package com.example.JavaFullStackMarchBatch.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mobile {

    public static void main(String[] args) {

//        Vodafone vodafone = new Vodafone();
//        vodafone.calling();
//        vodafone.data();
//
//        Airtel airtel = new Airtel();
//        airtel.calling();
//        airtel.data();

        ApplicationContext context = new AnnotationConfigApplicationContext(SimConfig.class);
        Sim vodafone = context.getBean(JIO.class);
        vodafone.calling();
        vodafone.data();

    }
}
