package com.example.JavaFullStackMarchBatch.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;


public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Employee findByName(String name);
//    select * from employee where name=?

    List<Employee> findByAddress(String address);

    Employee findByNameAndAddress(String name,String address);

    List<Employee> findByNameStartingWith(String name);

    List<Employee> findByNameContaining(String name);

    @Query(value = "select * from employee e where e.name like CONCAT('%',:name,'%')",nativeQuery = true)
    List<Map<String,String>> findByNameLike(@Param("name") String name);

    List<Employee> findByNameIgnoreCase(String name);
}
