package com.example.JavaFullStackMarchBatch.servicedemo.controller;

import com.example.JavaFullStackMarchBatch.servicedemo.domain.Laptop;
import com.example.JavaFullStackMarchBatch.servicedemo.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/laptop")
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    @PostMapping(value = "/save")
    private String saveLaptop(@RequestBody Laptop laptop){
        laptopService.save(laptop);

        return "saved..";
    }
}
