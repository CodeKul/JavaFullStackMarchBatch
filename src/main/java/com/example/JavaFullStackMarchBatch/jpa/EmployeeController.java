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
    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    @PutMapping(value = "update")
    public String update(@RequestBody Employee employee) {

        Employee employee1 = employeeRepository.getById(employee.getId());
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
    public String deleteEmp(@PathVariable(value = "id") List<Integer> id) {
        employeeRepository.deleteAllById(id);
        return "deleted employee of id=>" + id;
    }

    @GetMapping(value = "getEmpById/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable(value = "id")Integer id){
        Optional<Employee> e = employeeRepository.findById(id);
//        select * from employee where id =?
        return e;
    }


    @GetMapping(value = "getEmpByName/{name}")
    public Employee getEmpByName(@PathVariable(value = "name")String name){
       Employee e= employeeRepository.findByName(name);
        return e;
    }

    @GetMapping(value = "getEmpByAddress/{address}")
    public List<Employee> getEmpByAddress(@PathVariable(value = "address")String address){
        List<Employee> e = employeeRepository.findByAddress(address);
        return e;
    }

   @GetMapping(value = "getEmpByNameAndAddress")
    public Employee getEmpByAddress(@RequestParam(required = false) String name,
                                    @RequestParam String address){
        Employee e = employeeRepository.findByNameAndAddress(name,address);
        return e;
    }

   @GetMapping(value = "getEmpSt")
    public List<Employee> getEmpSt(@RequestParam String name){
        List<Employee> e = employeeRepository.findByNameStartingWith(name);
        return e;
    }

   @GetMapping(value = "getEmpContaining")
    public List<Employee> getEmpContaining(@RequestParam String name){
        List<Employee> e = employeeRepository.findByNameContaining(name);
        return e;
    }
}