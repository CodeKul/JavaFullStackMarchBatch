package com.example.JavaFullStackMarchBatch.ioc;

public class Vodafone implements Sim{
    @Override
    public void calling() {
        System.out.println("Calling from vodafone");
    }

    @Override
    public void data() {
        System.out.println("Data from vodafone");
    }
}
