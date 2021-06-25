package com.example.JavaFullStackMarchBatch.onetomany.controller;

import com.example.JavaFullStackMarchBatch.onetomany.domain.EmployeeM;
import com.example.JavaFullStackMarchBatch.onetomany.domain.Manager;
import com.example.JavaFullStackMarchBatch.onetomany.repository.EmployeeMRepo;
import com.example.JavaFullStackMarchBatch.onetomany.repository.ManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ManagerController {


    @Autowired
    private ManagerRepo managerRepo;

    @Autowired
    private EmployeeMRepo employeeMRepo;

    @PostMapping(value = "saveManager")
    public String saveManger(){

        Manager manager = new Manager();
        manager.setName("Avinash");
        manager.setContact(129003);
        manager.setAddress("Pune");

        List<EmployeeM> empList =new ArrayList<>();

        EmployeeM obj1 = new EmployeeM();
        obj1.setName("Akash");
        obj1.setAddress("Nagpur");
        obj1.setManager(manager);
        employeeMRepo.save(obj1);

        EmployeeM obj2 = new EmployeeM();
        obj2.setName("Suhas");
        obj2.setAddress("Pune");
        obj2.setManager(manager);
        employeeMRepo.save(obj2);

        EmployeeM obj3 = new EmployeeM();
        obj3.setName("Suhas");
        obj3.setAddress("Pune");
        obj3.setManager(manager);
        employeeMRepo.save(obj3);

        empList.add(obj1);
        empList.add(obj2);
        empList.add(obj3);

        manager.setEmployeeM(empList);
        managerRepo.save(manager);
        return "Manager employee saved...!";
    }


    @GetMapping(value = "getManager")
    public List<Manager> getManager(){
        return managerRepo.findAll();
    }


}
