package com.example.JavaFullStackMarchBatch.colorlib.controller;

import com.example.JavaFullStackMarchBatch.colorlib.domain.ColorLib;
import com.example.JavaFullStackMarchBatch.colorlib.repository.ColorLibRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorLibController {

    @Autowired
    private ColorLibRepository colorLibRepository;

    @PostMapping(value = "saveColorLib")
    public ResponseEntity<?> saveColorLib(@RequestBody ColorLib colorLib){
        colorLibRepository.save(colorLib);
        return new ResponseEntity<>("Successfully saved..", HttpStatus.CREATED);
    }

    @GetMapping(value = "getColorLib")
    public ResponseEntity<?>getColorLib(){

        return new ResponseEntity<>(colorLibRepository.findAll(),HttpStatus.FOUND);
    }



}
