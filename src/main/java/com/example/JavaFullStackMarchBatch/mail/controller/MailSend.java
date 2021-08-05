package com.example.JavaFullStackMarchBatch.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/")
public class MailSend {

    @Autowired
    private JavaMailSender mailSender;


    @PostMapping(value = "sendMail")
    public ResponseEntity<?> sendMail(){
        mail();
        return new ResponseEntity<>("Mail send successfully", HttpStatus.OK);
    }

    public void mail(){
        String from = "codekul.vaibhav@gmail.com";
        String to = "daudmujawar3831@gmail.com";

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(from);
        message.setTo(to);
        message.setSubject("Hii Daud");
        message.setText("Hii Daud, How are you...!");

        mailSender.send(message);
    }

}
