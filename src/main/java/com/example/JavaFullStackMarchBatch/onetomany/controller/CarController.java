package com.example.JavaFullStackMarchBatch.onetomany.controller;

import com.example.JavaFullStackMarchBatch.onetomany.domain.Car;
import com.example.JavaFullStackMarchBatch.onetomany.domain.SparePart;
import com.example.JavaFullStackMarchBatch.onetomany.repository.CarRepo;
import com.example.JavaFullStackMarchBatch.onetomany.repository.SpareRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarRepo carRepo;

    @Autowired
    private SpareRepo spareRepo;

    @PostMapping(value = "saveCar")
    public String saveCar(){

        Car car = new Car();
        car.setName("Audy");
        car.setModel(7);

        List<SparePart> sparePartList = new ArrayList<>();

        SparePart obj1 = new SparePart();
        obj1.setPartName("Engine");
        obj1.setQuantity(1);
        obj1.setCar(car);
        spareRepo.save(obj1);

        SparePart obj2 = new SparePart();
        obj2.setPartName("Wheel");
        obj2.setQuantity(4);
        obj2.setCar(car);
        spareRepo.save(obj2);


        sparePartList.add(obj1);
        sparePartList.add(obj2);
//        spareRepo.saveAll(sparePartList);

        car.setSparePart(sparePartList);
        carRepo.save(car);

        return "car saved...!";
    }


    @GetMapping(value = "getCar")
    public List<Car> getCar(){
        return carRepo.findAll();
    }

}
