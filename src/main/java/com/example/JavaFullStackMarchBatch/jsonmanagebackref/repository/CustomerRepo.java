package com.example.JavaFullStackMarchBatch.jsonmanagebackref.repository;

import com.example.JavaFullStackMarchBatch.jsonmanagebackref.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}
