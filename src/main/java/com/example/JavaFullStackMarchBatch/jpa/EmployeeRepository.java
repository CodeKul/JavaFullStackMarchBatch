package com.example.JavaFullStackMarchBatch.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Employee findByName(String name);
//    select * from employee where name=?

    List<Employee> findByAddress(String address);

    Employee findByNameAndAddress(String name,String address);

    List<Employee> findByNameStartingWith(String name);

    List<Employee> findByNameContaining(String name);
}
