package com.example.JavaFullStackMarchBatch.servicedemo.service;

import com.example.JavaFullStackMarchBatch.servicedemo.domain.Laptop;
import com.example.JavaFullStackMarchBatch.servicedemo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopImpl implements LaptopService{

    @Autowired
    private LaptopRepository laptopRepository;

    @Override
    public String save(Laptop laptop) {
        laptopRepository.save(laptop);

        return "Laptop saved...!";
    }
}
