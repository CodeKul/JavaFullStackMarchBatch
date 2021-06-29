package com.example.JavaFullStackMarchBatch.jsonmanagebackref.controller;

import com.example.JavaFullStackMarchBatch.jsonmanagebackref.domain.Customer;
import com.example.JavaFullStackMarchBatch.jsonmanagebackref.repository.CustomerRepo;
import com.example.JavaFullStackMarchBatch.jsonmanagebackref.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/customer/")
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private OrderRepo orderRepo;

    @PostMapping(value = "saveCustomer")
    public String saveCustomer(@RequestBody Customer customer){
        customerRepo.save(customer);
        return "customer saved...!";
    }

    @GetMapping(value = "getCustomer")
    public List<Customer> getCustomer(){
      return  customerRepo.findAll();
    }
}
