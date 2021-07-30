package com.example.JavaFullStackMarchBatch.admission.controller;

import com.example.JavaFullStackMarchBatch.admission.domain.StudentAdm;
import com.example.JavaFullStackMarchBatch.admission.repository.StudentAdmRepo;
import com.example.JavaFullStackMarchBatch.colorlib.domain.ColorLib;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/")
public class AdmissionController {

    @Autowired
    private StudentAdmRepo studentAdmRepo;


    @PostMapping(value = "saveStudentAdm")
    public ResponseEntity<?> admission(@RequestBody StudentAdm studentAdm){
        studentAdmRepo.save(studentAdm);
        return new ResponseEntity<>("Successfully saved..", HttpStatus.CREATED);
    }

    @GetMapping(value = "getStudent")
    public ResponseEntity<?>getStudent(){

        return new ResponseEntity<>(studentAdmRepo.findAll(),HttpStatus.OK);
    }
}
