package com.example.JavaFullStackMarchBatch.storeprocedure.repository;

import com.example.JavaFullStackMarchBatch.jsonmanagebackref.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface SpRepository extends JpaRepository<Customer,Integer> {

    @Query(value = "{call test()}",nativeQuery = true)
    List<Customer> spCall();

     @Query(value = "{call getEmployeeData()}",nativeQuery = true)
    List<Map<String,String>> spEmployeeData();



}
