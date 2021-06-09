package com.example.JavaFullStackMarchBatch.rest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {


    @GetMapping(value = "helloWorld")
    public String helloWorld(){
        return "Hii Spring";
    }

    @PostMapping("postData")
    public String postData(@RequestBody Student student){
        System.out.println(student.id+" "+student.name);
        return "Hii";
    }

}
