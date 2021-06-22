package com.example.JavaFullStackMarchBatch.onetoone.controller;

import com.example.JavaFullStackMarchBatch.onetoone.domain.Address;
import com.example.JavaFullStackMarchBatch.onetoone.domain.User;
import com.example.JavaFullStackMarchBatch.onetoone.repository.AddressRepo;
import com.example.JavaFullStackMarchBatch.onetoone.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private AddressRepo addressRepo;

    @PostMapping(value = "saveUser")
    public String saveUser(){

        User user = new User();
        user.setName("Ravi");
        user.setContact(12132);


        Address address = new Address();
        address.setAddress("Kothrud");
        address.setCity("Pune");
        address.setPinCode(123432);

        address.setUser(user);
        user.setAddress(address);

        userRepo.save(user);
        addressRepo.save(address);

        return "User saved";

    }
}
