package com.example.JavaFullStackMarchBatch;

public class AutoboxingDemo {

    public static void main(String[] args) {

        int i = 8;
        Integer j = i;
        System.out.println(i);
        System.out.println(j);
        
        String str = "8";
        Integer k = Integer.parseInt(str);
        System.out.println(k);
    }
}
