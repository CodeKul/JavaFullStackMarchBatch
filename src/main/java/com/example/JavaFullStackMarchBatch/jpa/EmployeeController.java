package com.example.JavaFullStackMarchBatch.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    @PostMapping(value = "saveEmp")
    public String saveEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return "Employee Saved...!";
    }


    @GetMapping(value = "getEmp")
    public List<Employee> getEmployee(){
      return employeeRepository.findAll();
    }

    @PutMapping(value = "update")
    public String update(@RequestBody Employee employee){

       Employee employee1 =  employeeRepository.getById(employee.getId());
//       employee1.setName(employee.getName());
//       employee1.setAddress(employee.getAddress());
       employee1.setContact(employee.getContact());
       employeeRepository.save(employee1);
       return "Updated...!";

    }

//
//    @DeleteMapping(value = "deleteEmployee/{id}")
//    public String  deleteEmp(@PathVariable(value = "id")Integer id){
//        employeeRepository.deleteById(id);
//        return "deleted employee of id=>"+id;
//    }
//

//    @DeleteMapping(value = "deleteEmployee/{id}")
//    public String  deleteEmp(@PathVariable(value = "id")Integer id){
//       Employee employee= employeeRepository.getById(id);
//       employeeRepository.delete(employee);
//        return "deleted employee of id=>"+id;
//    }

//   @DeleteMapping(value = "deleteEmployee")
//    public String  deleteEmp(){
//       employeeRepository.deleteAll();
//        return "deleted employee of id=>";
//    }

   @DeleteMapping(value = "deleteEmployee/{id}")
    public String  deleteEmp(@PathVariable(value = "id")List<Integer> id){
       employeeRepository.deleteAllById(id);
        return "deleted employee of id=>"+id;
    }



}