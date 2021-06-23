package com.example.JavaFullStackMarchBatch.onetoone.controller;

import com.example.JavaFullStackMarchBatch.onetoone.domain.Address;
import com.example.JavaFullStackMarchBatch.onetoone.domain.User;
import com.example.JavaFullStackMarchBatch.onetoone.repository.AddressRepo;
import com.example.JavaFullStackMarchBatch.onetoone.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private AddressRepo addressRepo;

    @PostMapping(value = "saveUser")
    public String saveUser() {

        User user = new User();
        user.setName("Akash");
        user.setContact(12132);


        Address address = new Address();
        address.setAddress("Kolhapur");
        address.setCity("Kolhapur");
        address.setPinCode(234234);

        address.setUser(user);
        user.setAddress(address);

        userRepo.save(user);
        addressRepo.save(address);

        return "User saved";

    }


    @GetMapping(value = "getUsers")
    public List<User> getUser() {
        return userRepo.findAll();
    }

}
