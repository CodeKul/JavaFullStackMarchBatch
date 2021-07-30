package com.example.JavaFullStackMarchBatch.login.controller;

import com.example.JavaFullStackMarchBatch.login.domain.Registration;
import com.example.JavaFullStackMarchBatch.login.dto.Login;
import com.example.JavaFullStackMarchBatch.login.repository.RegistraationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/")
public class RegistrationController {

    @Autowired
    private RegistraationRepo registraationRepo;

    @PostMapping(value = "saveUser")
    public ResponseEntity<?>saveUser(@RequestBody Registration registration){
        if(registration.getConfirmPassword().equals(registration.getPassword())){
            registraationRepo.save(registration);
            return new ResponseEntity<>("save...", HttpStatus.OK);
        }else {
            return new ResponseEntity<>("password and confirm password is not matched", HttpStatus.OK);
        }
    }

    @GetMapping(value = "getUser")
    public ResponseEntity<?>getUser(){
        return new ResponseEntity<>(registraationRepo.findAll(),HttpStatus.OK);
    }

    @PostMapping(value = "login")
    public ResponseEntity<?> login(@RequestBody Login login){

        Registration registration= registraationRepo.findByUserName(login.getUserName());

        if(registration.getUserName().equals(login.getUserName())
                && registration.getPassword().equals(login.getPassword())){
            return new ResponseEntity<>("Login Successfully..",HttpStatus.OK);
        }else {
            return new ResponseEntity<>("Login Failed",HttpStatus.BAD_REQUEST);
        }
    }
}
