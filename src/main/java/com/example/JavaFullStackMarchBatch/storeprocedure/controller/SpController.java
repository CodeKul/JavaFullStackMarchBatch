package com.example.JavaFullStackMarchBatch.storeprocedure.controller;

import com.example.JavaFullStackMarchBatch.jsonmanagebackref.domain.Customer;
import com.example.JavaFullStackMarchBatch.storeprocedure.repository.SpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "api/sp/")
public class SpController {

    @Autowired
    private SpRepository spRepository;

    @RequestMapping(value = "/spCall", method = RequestMethod.GET)
    public ResponseEntity<?> spCall() {
        List<Customer> list = spRepository.spCall();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/spGetEmployee", method = RequestMethod.GET)
    private ResponseEntity<?> spGetEmployee() {
        List<Map<String,String>> list = spRepository.spEmployeeData();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
